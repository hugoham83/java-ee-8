package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@RequestScoped
public class RequestBean implements Serializable {
    public static Integer cont = 0;
    public RequestBean(){
        cont++;
    }
    public String getCont(){
        return cont.toString();
    }
    @PostConstruct
    private void init(){
        System.out.println("RequestBean fui criado :" + LocalDateTime.now());
    }


    @PreDestroy
    private void destroy(){
        System.out.println("RequestBean fui destruido :" + LocalDateTime.now());

    }

}
