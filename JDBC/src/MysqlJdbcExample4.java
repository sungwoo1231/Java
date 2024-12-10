import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlJdbcExample4 {
    // #1. 재고수량을 매개변수로 전달하고 재고수량 미만인 제품의 제품번호,제품명,총주문건수 조회
    // Map을 사용하여 메서드내에서 출력하도록 구현
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void getProductsWithStock(int stock) {
        String query = "select 제품.제품번호, 제품명,count(주문번호) as 총주문건수 from 제품 " +
                " inner join 주문세부 on 제품.제품번호 = 주문세부.제품번호 " +
                " where 재고 < ? " +
                "group by 제품번호,제품명";
        List<Map<String, Object>> products = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, stock);

            try (ResultSet resultSet = pstmt.executeQuery()) {
                while (resultSet.next()) {
                    Map<String, Object> product = new HashMap<>();
                    product.put("제품번호", resultSet.getString("제품번호"));
                    product.put("제품명", resultSet.getString("제품명"));
                    product.put("총주문건수", resultSet.getString("총주문건수"));
                    products.add(product);
                }
                for (Map<String, Object> product : products) {
                    System.out.println(product);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    // #2. 매개변수로 날짜(date)와 기간(개월수)(month)를 전달하고 해당 날짜를
    // 기준으로 개월수이내의 주문정보를 골라 아래 컬럼을 조회
    // 예를들어, 2022-02-01 기준으로 3개월 이내의 주문정보
    // 사원번호, 이름, 직위
    public void getEmployeesWithDuration(String date, int month) {
        String query = "select 사원번호,이름,직위 " +
                "from 사원 " +
                "where 사원번호 in (select 사원번호 from 주문 where 주문일 >= adddate(?, interval ? month));";
        List<Map<String, Object>> employees = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, date);
            pstmt.setInt(2, month);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                while (resultSet.next()) {
                    Map<String, Object> employee = new HashMap<>();
                    employee.put("사원번호", resultSet.getString("사원번호"));
                    employee.put("이름", resultSet.getString("이름"));
                    employee.put("직위", resultSet.getString("직위"));
                    employees.add(employee);
                }
                for (Map<String, Object> employee : employees) {
                    System.out.println(employee);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    // #3. 매개변수로 도시를 전달하고 해당도시별 고객들에 대한 주문년도별 주문건수 조회
    public void getNumOfOrdersByCity(String city) {
        String query = "select year (주문일) as 주문년도, count(주문번호) as 주문건수\n" +
                "from 주문\n" +
                "where 고객번호 in (select 고객번호 from 고객 where 고객.도시 =? )\n" +
                "group by 주문년도";
        List<Map<String,Object>> orders = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, city);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                while (resultSet.next()) {
                    Map<String,Object> order = new HashMap<>();
                    order.put("주문건수",resultSet.getString("주문건수"));
                    order.put("주문년도",resultSet.getString("주문년도"));

                    orders.add(order);

                }
                for (Map<String, Object> order : orders){
                    System.out.println(order);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MysqlJdbcExample4 repository = new MysqlJdbcExample4();
        // repository.getProductsWithStock(4);
       // repository.getEmployeesWithDuration("2022-02-01", -3);
        repository.getNumOfOrdersByCity("서울특별시");
    }
}