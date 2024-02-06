package com.suraj.practice.constructor.binding;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

  private final DataRepository dataRepository;

  public EmailServiceImpl(DataRepository dataRepository) {
    this.dataRepository = dataRepository;
  }

  @Override
  public void getData() {
    dataRepository.getData();

  }
}
