package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  

  // You need to add code here
  @Override
  public boolean add( Product pr )
  { 
	  if (!super.contains(pr)) {
		  super.add(pr);

		 } 
	  else {
		  for (int i=0; i < super.size(); i++) {
			  if (super.get(i).equals(pr)) {
				  double y = super.get(i).getPrice();
				  super.get(i).setPrice(y + pr.getPrice());
				  }      
		  }
	  }
      Collections.sort(this, new Comparator<Product>() {
    	  @Override
    	  public int compare(Product p1, Product p2) {
    		  return p1.getProductNum().compareTo(p2.getProductNum());
    		  }
    	  });
      return true;
  }
  public String getDetails() {
	  return "BetterBasket: \n" + super.getDetails();
  }
}
