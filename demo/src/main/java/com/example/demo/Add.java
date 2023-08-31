package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class Add {
	@GetMapping(value = "/total/{a}/{b}")
	public int Settotal(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(value = "/prime/{a}")
	public String setprime(@PathVariable int a) {
		if (a % 2 != 0) {
			return "PRIME";
		} else {
			return "NOT PRIME";
		}
	}
    @GetMapping(value="/palindrome/{a}")
    public String setpalindrome(@PathVariable String a) {
    	String s="";
    	for(int i=a.length()-1;i>=0;i--) {
    	s=s+a.charAt(i);}
    	if(a.equalsIgnoreCase(s)) {
    	return "palindrome";
    	}
    	else {
    
    	return "not palindrome";
    	}
    
		

}
    @GetMapping(value="/getSeries/{n}")
    public List<Integer> setSeries(@PathVariable int n){
    	List<Integer> li=new ArrayList<>();
    	li.add(0);
    	li.add(1);
    	int a=0;
    	int b=1;
    	for(int i=0;i<=n;i++) {	
    		int c=a+b;
    		a=b;
    		b=c;
    	    li.add(c);
    	   
    	}
    
    	return li;
    }
    @GetMapping(value="/CheckUserNameAndPassword")
    public String getAccess(@RequestParam String UserName,@RequestParam String Password){
    	if(UserName.equals("monisha")&&Password.equals("1234")) {
    		return "Accessed";
    	}
    	else {
    		return "Denied";
    	}
    }
   @GetMapping(value="/getCar/{tax}")
   public Car getCar(@RequestBody Car c,@PathVariable int tax) {
	   c.setPrice(c.getPrice()+c.getPrice()*tax/100);
	   return c;
   }
   
   @GetMapping(value="/setList")
   public List<Car> getCars(@RequestBody List<Car>cars) {
	   List<Car> a=cars.stream().filter(c->c.getColor().equals("black")).collect(Collectors.toList());
       return a;
   }
       @GetMapping(value="/setLi")
       public List<Car> getLi(@RequestBody List<Car>licar) { 
       List<Car> b=licar.stream().filter(n->n.getBrand().equals("benz")).map(g->{g.setPrice(g.getPrice()*18/100);
       return g;}).collect(Collectors.toList());
	return b;
      	
	    }
       @GetMapping(value="/setX")
       public int getX(@RequestBody List<Car> xp){
    	Car s=xp.stream().min(Comparator.comparing(Car::getPrice)).get(); 
    	return s.getPrice();
       }
       
       @GetMapping(value="/setY")
       public int getY(@RequestBody List<Car> xy){
    	Car kl=xy.stream().max(Comparator.comparing(Car::getPrice)).get(); 
    	return kl.getPrice();
       }
       @GetMapping(value="/setZ")
       public List<Car> getZ(@RequestBody List<Car> xz) {
    	   List<Car> m=xz.stream().filter(c->c.getColor().equals("black")).map(f->{f.setPrice(f.getPrice()-50000);return f;}).collect(Collectors.toList());
           return m;
       }
       @GetMapping("/setA")
       public Car getA(@RequestBody List<Car> xa){
    	  List<Car> a=xa.stream().map(c->c.getBrand().charAt(0)).collect(Collectors.toList());
    	   return a
    			   ;
       }
       
       
}
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    