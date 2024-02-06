package com.suraj.practice.constructor.binding;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class EmailComponent {


  @PostConstruct
  public void getData(){
    EmailService emailService=new EmailServiceImpl(new DataRepositoryImpl());
    emailService.getData();
  }



}
