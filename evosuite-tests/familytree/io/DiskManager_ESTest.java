/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 28 23:41:07 GMT 2018
 */

package familytree.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import familytree.io.DiskManager;
import familytree.model.Person;
import familytree.view.PersonTableModel;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiskManager_ESTest extends DiskManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("Daughter", "Daughter", "Daughter");
      Person person1 = personTableModel0.createPerson("Daughter", "female", "female");
      person1.addSpouse(person0);
      diskManager0.writeToDisk(personTableModel0);
      PersonTableModel personTableModel1 = new PersonTableModel();
      diskManager0.readFromDisk(personTableModel1);
      assertEquals(2, personTableModel1.getRowCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("Daughter", "Daughter", "Daughter");
      Person person1 = personTableModel0.createPerson("male", "female", "Daughter");
      person0.addChild(person1);
      diskManager0.writeToDisk(personTableModel0);
      PersonTableModel personTableModel1 = new PersonTableModel();
      diskManager0.readFromDisk(personTableModel1);
      assertEquals(2, personTableModel1.getRowCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      // Undeclared exception!
      try { 
        diskManager0.writeToDisk((PersonTableModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        diskManager0.writeToDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/johnphilmurray/Desktop/SWEN-352/352Activity2/FamilyTreePersons.fml");
      FileSystemHandling.createFolder(evoSuiteFile0);
      PersonTableModel personTableModel0 = new PersonTableModel();
      try { 
        diskManager0.writeToDisk(personTableModel0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      diskManager0.writeToDisk(personTableModel0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/johnphilmurray/Desktop/SWEN-352/352Activity2/FamilyTreeRelations.fml");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "4");
      // Undeclared exception!
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      personTableModel0.createPerson("Jc%1P?,KRgKDa}I<$V", ";\n", "[WF(");
      diskManager0.writeToDisk(personTableModel0);
      // Undeclared exception!
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      personTableModel0.createPerson("", "Son", "cP~[ZA(0N7A");
      diskManager0.writeToDisk(personTableModel0);
      // Undeclared exception!
      try { 
        diskManager0.readFromDisk((PersonTableModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("Daughter", "Daughter", "Daughter");
      Person person1 = personTableModel0.createPerson("male", "female", "Daughter");
      person0.addChild(person1);
      Person person2 = personTableModel0.createPerson("Daughter", "female", "female");
      person2.addSpouse(person1);
      diskManager0.writeToDisk(personTableModel0);
      assertEquals(3, personTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("Daughter", "Daughter", "Daughter");
      Person person1 = personTableModel0.createPerson("male", "female", "Daughter");
      person0.addChild(person1);
      diskManager0.writeToDisk(personTableModel0);
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddRelation failed when reading file.
         //  The file is likely corrupt
         //
         verifyException("familytree.io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson("Daughter", "Daughter", "Daughter");
      Person person1 = personTableModel0.createPerson("Daughter", "female", "female");
      person0.addChild(person1);
      diskManager0.writeToDisk(personTableModel0);
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // AddRelation failed when reading file.
         //  The file is likely corrupt
         //
         verifyException("familytree.io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = personTableModel0.createPerson(".vJ+CUUTr/X", ".vJ+CUUTr/X", ".vJ+CUUTr/X");
      Person person1 = new Person(".vJ+CUUTr/X", "male", false);
      person0.addChild(person1);
      diskManager0.writeToDisk(personTableModel0);
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Found none-existing person in relation when reading file.
         //  The file is likely corrupt
         //
         verifyException("familytree.io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      PersonTableModel personTableModel0 = new PersonTableModel();
      Person person0 = new Person("Daughter", "Daughter", false);
      Person person1 = personTableModel0.createPerson("Daughter", "female", "female");
      person0.addChild(person1);
      diskManager0.writeToDisk(personTableModel0);
      try { 
        diskManager0.readFromDisk(personTableModel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Found none-existing person in relation when reading file.
         //  The file is likely corrupt
         //
         verifyException("familytree.io.DiskManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DiskManager diskManager0 = DiskManager.getDiskManager();
      DiskManager diskManager1 = DiskManager.getDiskManager();
      assertSame(diskManager1, diskManager0);
  }
}