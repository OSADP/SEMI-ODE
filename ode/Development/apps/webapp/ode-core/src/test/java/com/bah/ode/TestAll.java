package com.bah.ode;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 4/4/16 6:09 PM
 * @author 572682
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
   com.bah.ode.model.TestAll.class,
   com.bah.ode.wrapper.TestAll.class,
})
public class TestAll {

   /**
    * Launch the test.
    *
    * @param args the command line arguments
    *
    * @generatedBy CodePro at 4/4/16 6:09 PM
    */
   public static void main(String[] args) {
      JUnitCore.runClasses(new Class[] { TestAll.class });
   }
}
