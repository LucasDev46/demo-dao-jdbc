package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== FindById ===");
        Department x = departmentDao.findById(3);
        System.out.println(x);

        System.out.println("\n=== TEST 2: findAll =======");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }
        System.out.println("\n=== TEST 3: Delete =======");
        System.out.println("Enter a Id for delete test");
        int id = sc.nextInt();
        departmentDao.DeleteById(id);
        System.out.println("Delete completed!");

        System.out.println("\n=== TEST 3: Update =======");
        Department dep = departmentDao.findById(1);
        dep.setName("Food");
        departmentDao.update(dep);
        System.out.println("Update complete!");

        System.out.println("\n=== TEST 3: Insert =======");
        Department newDep = new Department(null, "Music");
        departmentDao.insert(newDep);
        System.out.println("Inserted! New Id: " + newDep.getId());

        sc.close();
    }
}
