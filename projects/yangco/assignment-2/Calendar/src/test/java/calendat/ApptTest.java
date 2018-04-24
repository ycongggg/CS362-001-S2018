/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt1 = new Appt(14, 30, 9, 14, 2018, "Class", "Rescheduled class", "xyz@gmail.com");
      String string1 = appt1.toString();
      assertEquals(2, appt1.getRecurBy());
      assertFalse(appt1.isRecurring());
      assertEquals("\t14/9/2018 at 2:30pm ,Class, Rescheduled class\n", string1);
      assertEquals(0, appt1.getRecurIncrement());
      appt1.setValid();
  }

   @Test(timeout = 4000)
   public void test02()  throws Throwable  {
       Appt appt2 = new Appt(16, 30, 9, 22, 2018, "Visit", "Visiting my parents", "xyz@gmail.com");
       String string2 = appt2.toString();
       assertEquals(2, appt2.getRecurBy());
       //assertFalse(appt2.isRecurring());
       assertEquals("\t22/9/2018 at 4:30pm ,Visit, Visiting my parents\n", string2);
       assertEquals(0, appt2.getRecurIncrement());
       appt2.setValid();
   }

}
