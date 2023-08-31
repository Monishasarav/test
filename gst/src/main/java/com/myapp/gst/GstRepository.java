package com.myapp.gst;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface GstRepository extends JpaRepository<GstEntity,Integer> {
	@Query(value="select percentage FROM Gst_details where hsncode=?",nativeQuery=true)
	public int getpercent(int hsncode);
}
