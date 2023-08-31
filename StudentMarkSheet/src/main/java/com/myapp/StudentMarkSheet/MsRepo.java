package com.myapp.StudentMarkSheet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MsRepo extends JpaRepository<MarkSheet,Integer> {

}
