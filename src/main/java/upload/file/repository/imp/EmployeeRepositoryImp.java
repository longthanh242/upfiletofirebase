package upload.file.repository.imp;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import upload.file.model.Employee;
import upload.file.repository.EmployeeRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeRepositoryImp implements EmployeeRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> renderAll() {
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    @Transactional
    public boolean createEmployee(Employee employee) {
        try {
            entityManager.persist(employee);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
