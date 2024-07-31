package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;



    @Override
    public List<User> getAllUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUserById(long id) {
        return em.find(User.class, id);

    }

    @Override
    public void addUser(User user) {
        em.persist(user);

    }

    @Override
    public void removeUser(long id) {
        em.remove(getUserById(id));
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }
}
