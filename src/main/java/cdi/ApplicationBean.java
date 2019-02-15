package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApplicationScoped
public class ApplicationBean implements Serializable {
    public static Integer cont = 0;
    public ApplicationBean(){
         cont++;
    }
    public String getCont(){
        return cont.toString();
    }

    @PostConstruct
    private void init(){
        System.out.println("ApplicationBean fui criado :" + LocalDateTime.now());
    }
    @PreDestroy
    private void destroy(){
        System.out.println("ApplicationBean fui destruido :" + LocalDateTime.now());

    }
}
