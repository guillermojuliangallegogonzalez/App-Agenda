package appagenda;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author guillermogallegogonzalez
 */
public class AppAgenda {

    public static void main(String[] args){
    EntityManagerFactory emf=
    Persistence.createEntityManagerFactory("AppAgendaPU");
    EntityManager em=emf.createEntityManager();
    }
    
}
