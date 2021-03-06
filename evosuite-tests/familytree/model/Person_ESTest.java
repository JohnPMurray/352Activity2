/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 28 23:38:55 GMT 2018
 */

package familytree.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import familytree.model.Person;
import familytree.model.Relation;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Person_ESTest extends Person_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Person person0 = new Person("bdTbc<", "bdTbc<", true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 2, 2, (-369));
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2,MONTH=2,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=2,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=-369,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertFalse(boolean0);
      assertEquals(1, person0.getId());
      assertEquals("bdTbc<", person0.getFirstName());
      assertEquals("bdTbc<", person0.getLastName());
      assertEquals("female", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Person person0 = new Person("", "FZqM}).WF*\"", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(1310, 1310, 1310, 0, 0, 0);
      person0.setDateOfDeath(mockGregorianCalendar0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 1310, 0, (-3673), 0);
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar1);
      assertEquals(1, person0.getId());
      assertEquals("FZqM}).WF*\"", person0.getLastName());
      assertEquals("", person0.getFirstName());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=1310,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-3673,HOUR_OF_DAY=-3673,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar1.toString());
      assertFalse(boolean0);
      assertEquals("male", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Person person0 = new Person("[", "Relation exists or is illegal", true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3594, (-1), (-1), 801, 801, 1970);
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar0);
      assertEquals(1, person0.getId());
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3594,MONTH=-1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=801,HOUR_OF_DAY=801,MINUTE=801,SECOND=1970,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals("[", person0.getFirstName());
      assertEquals("Relation exists or is illegal", person0.getLastName());
      assertEquals(1, person0.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Person person0 = Person.restorePerson(1328, "female", "kfz>{dP", true);
      assertEquals("kfz>{dP", person0.getLastName());
      assertEquals("female", person0.getFirstName());
      assertEquals(1328, person0.getId());
      assertTrue(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Person person0 = new Person("]&1Ca2*5vONzfSK!d(", "]&1Ca2*5vONzfSK!d(", true);
      boolean boolean0 = person0.isFemale();
      assertTrue(boolean0);
      assertEquals(1, person0.getId());
      assertEquals("]&1Ca2*5vONzfSK!d(", person0.getFirstName());
      assertEquals("]&1Ca2*5vONzfSK!d(", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Person person0 = new Person("Father", "Father", false);
      Person person1 = new Person("female", "male", false);
      person0.addChild(person1);
      assertEquals(2, person1.getId());
      assertEquals("male", person1.getLastName());
      assertEquals("female", person1.getFirstName());
      
      person0.getRelationships();
      assertEquals("Father", person0.getFirstName());
      assertFalse(person0.isFemale());
      assertEquals("Father", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Person person0 = new Person("_JT4;", (String) null, true);
      String string0 = person0.getLastName();
      assertEquals("_JT4;", person0.getFirstName());
      assertEquals(1, person0.getId());
      assertNull(string0);
      assertEquals("female", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Person person0 = new Person("", "CA}", true);
      assertEquals("CA}", person0.getLastName());
      
      person0.setLastName("");
      String string0 = person0.getLastName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "female", "male", false);
      int int0 = person0.getId();
      assertEquals("male", person0.getLastName());
      assertFalse(person0.isFemale());
      assertEquals(0, int0);
      assertEquals("female", person0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Person person0 = Person.restorePerson((-1), "female", "", false);
      int int0 = person0.getId();
      assertEquals("female", person0.getFirstName());
      assertEquals("", person0.getLastName());
      assertEquals((-1), int0);
      assertEquals("male", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Person person0 = new Person((String) null, "tR?Oru-Rng=", false);
      String string0 = person0.getFirstName();
      assertEquals("tR?Oru-Rng=", person0.getLastName());
      assertEquals(1, person0.getId());
      assertNull(string0);
      assertEquals("male", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Person person0 = new Person("Dv", "", true);
      String string0 = person0.getFirstName();
      assertEquals(1, person0.getId());
      assertEquals("", person0.getLastName());
      assertEquals("Dv", string0);
      assertTrue(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Person person0 = new Person("=r0rD<4?hjx~i", "=r0rD<4?hjx~i", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), (-1), 22, 22);
      mockGregorianCalendar0.setLenient(false);
      person0.setDateOfDeath(mockGregorianCalendar0);
      person0.getDateOfDeath();
      assertEquals(1, person0.getId());
      assertEquals("=r0rD<4?hjx~i", person0.getFirstName());
      assertFalse(person0.isFemale());
      assertEquals("=r0rD<4?hjx~i", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Person person0 = new Person("", "", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(57, 0, 57);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-28));
      person0.setDateOfDeath(mockGregorianCalendar0);
      person0.getDateOfDeath();
      assertEquals("", person0.getFirstName());
      assertEquals(1, person0.getId());
      assertFalse(person0.isFemale());
      assertEquals("", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Person person0 = new Person("", " ", true);
      person0.setDateOfDeath((GregorianCalendar) null);
      // Undeclared exception!
      try { 
        person0.getDateOfDeath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Person person0 = new Person("0- mV;#xw", "d", false);
      person0.setDateOfBirth((GregorianCalendar) null);
      // Undeclared exception!
      try { 
        person0.getDateOfBirth();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Person person0 = new Person("Father", "Father", false);
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        person0.dateOfDeathEquals(calendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Person person0 = new Person("1=`ohJ:0h", "1=`ohJ:0h", true);
      // Undeclared exception!
      try { 
        person0.addSpouse((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Person person0 = new Person("", "", false);
      // Undeclared exception!
      try { 
        person0.addChild((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Person person0 = new Person("aY[&(*mw2YSSh", "Daughter", true);
      Person person1 = new Person("aY[&(*mw2YSSh", "aY[&(*mw2YSSh", false);
      person0.addSpouse(person1);
      assertEquals("Daughter", person0.getLastName());
      assertEquals("aY[&(*mw2YSSh", person0.getFirstName());
      
      Relation relation0 = person1.getRelation(person1);
      assertNull(relation0);
      assertFalse(person1.isFemale());
      assertEquals(2, person1.getId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Person person0 = new Person("", "CA}", true);
      Person person1 = new Person("", "male", true);
      person0.addChild(person1);
      Relation relation0 = person0.getRelation(person1);
      assertEquals("CA}", person0.getLastName());
      assertNotNull(relation0);
      assertTrue(person1.isFemale());
      assertEquals(2, person1.getId());
      assertEquals("", person1.getFirstName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Person person0 = new Person("aY[&(*mw2YSSh", "Daughter", true);
      Person person1 = new Person("aY[&(*mw2YSSh", "aY[&(*mw2YSSh", false);
      person0.addSpouse(person1);
      Relation relation0 = person1.getRelation(person0);
      assertEquals("aY[&(*mw2YSSh", person0.getFirstName());
      assertEquals(2, person1.getId());
      assertNotNull(relation0);
      assertEquals("Daughter", person0.getLastName());
      assertEquals(0, person1.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Person person0 = new Person(">~>`#rFv7y", ">~>`#rFv7y", false);
      Person person1 = new Person("", "male", false);
      person0.addChild(person1);
      assertEquals(2, person1.getId());
      assertEquals("", person1.getFirstName());
      assertEquals("male", person1.getLastName());
      
      Relation relation0 = person0.getRelation(person0);
      assertNull(relation0);
      assertEquals(0, person0.getGenderAsInt());
      assertEquals(">~>`#rFv7y", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Person person0 = new Person("Father", "Father", false);
      person0.getRelationships();
      assertEquals(1, person0.getId());
      assertEquals("Father", person0.getFirstName());
      assertEquals(0, person0.getGenderAsInt());
      assertEquals("Father", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Person person0 = new Person("", "", false);
      TimeZone timeZone0 = TimeZone.getTimeZone("female");
      Locale locale0 = Locale.PRC;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      person0.setDateOfDeath(mockGregorianCalendar0);
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar0);
      assertTrue(boolean0);
      assertEquals(1, person0.getId());
      assertEquals("", person0.getLastName());
      assertFalse(person0.isFemale());
      assertEquals("", person0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Person person0 = new Person("0XNN54n", "0XNN54n", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1);
      person0.setDateOfDeath(mockGregorianCalendar0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, (-12), 1);
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar1);
      assertEquals("0XNN54n", person0.getFirstName());
      assertFalse(boolean0);
      assertEquals(1, person0.getId());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=-12,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar1.toString());
      assertEquals("0XNN54n", person0.getLastName());
      assertFalse(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-12), 1);
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("0X!NN54n", person0.getLastName());
      assertEquals(1, person0.getId());
      assertEquals("0X!NN54n", person0.getFirstName());
      assertEquals("male", person0.getGender());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=-12,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Person person0 = new Person("x", "x`a8beSi/vg['", false);
      GregorianCalendar gregorianCalendar0 = person0.getDateOfBirth();
      boolean boolean0 = person0.dateOfDeathEquals(gregorianCalendar0);
      assertEquals(1, person0.getId());
      assertTrue(boolean0);
      assertEquals("male", person0.getGender());
      assertEquals("x", person0.getFirstName());
      assertEquals("x`a8beSi/vg['", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Person person0 = new Person("", " ", true);
      boolean boolean0 = person0.dateOfDeathEquals((Calendar) null);
      assertEquals(" ", person0.getLastName());
      assertEquals(1, person0.getId());
      assertTrue(person0.isFemale());
      assertFalse(boolean0);
      assertEquals("", person0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Person person0 = new Person("", "FZqM}).WF*\"", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      person0.setDateOfBirth(mockGregorianCalendar0);
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar0);
      assertTrue(boolean0);
      assertEquals("FZqM}).WF*\"", person0.getLastName());
      assertEquals("", person0.getFirstName());
      assertFalse(person0.isFemale());
      assertEquals(1, person0.getId());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Person person0 = new Person("0XNN54n", "0XNN54n", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-12), 1);
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=-12,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals(1, person0.getId());
      assertEquals("0XNN54n", person0.getFirstName());
      assertEquals("0XNN54n", person0.getLastName());
      assertFalse(boolean0);
      assertEquals(0, person0.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Person person0 = new Person("0XNN54n", "0XNN54n", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1);
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar0);
      assertEquals("0XNN54n", person0.getFirstName());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals("0XNN54n", person0.getLastName());
      assertEquals(1, person0.getId());
      assertFalse(boolean0);
      assertEquals(0, person0.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Person person0 = new Person("Spouse", "Spouse", true);
      GregorianCalendar gregorianCalendar0 = person0.getDateOfDeath();
      boolean boolean0 = person0.dateOfBirthEquals(gregorianCalendar0);
      assertEquals("Spouse", person0.getLastName());
      assertEquals(1, person0.getId());
      assertEquals("Spouse", person0.getFirstName());
      assertEquals("female", person0.getGender());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Person person0 = new Person("female", "female", false);
      boolean boolean0 = person0.dateOfBirthEquals((Calendar) null);
      assertEquals(1, person0.getId());
      assertEquals("female", person0.getFirstName());
      assertFalse(boolean0);
      assertEquals("female", person0.getLastName());
      assertEquals("male", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Person person0 = new Person("Spouse", "Spouse", true);
      int int0 = person0.getGenderAsInt();
      assertEquals(1, person0.getId());
      assertEquals("Spouse", person0.getFirstName());
      assertEquals(1, int0);
      assertEquals("Spouse", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      int int0 = person0.getGenderAsInt();
      assertEquals("0X!NN54n", person0.getLastName());
      assertEquals(1, person0.getId());
      assertEquals(0, int0);
      assertEquals("0X!NN54n", person0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Person person0 = new Person("Father", "Father", false);
      assertEquals(0, person0.getGenderAsInt());
      
      person0.setFemale(true);
      person0.getGender();
      assertEquals(1, person0.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      String string0 = person0.getGender();
      assertEquals("male", string0);
      assertEquals("0X!NN54n", person0.getLastName());
      assertEquals("0X!NN54n", person0.getFirstName());
      assertEquals(1, person0.getId());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Person person0 = new Person(">~>`#rFv7y", ">~>`#rFv7y", false);
      Person person1 = new Person(">~>`#rFv7y", (String) null, true);
      person1.addSpouse(person0);
      assertEquals(">~>`#rFv7y", person0.getLastName());
      
      person1.getChildren();
      assertEquals(2, person1.getId());
      assertEquals(">~>`#rFv7y", person1.getFirstName());
      assertTrue(person1.isFemale());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Person person0 = new Person(">~>`#rFv7y", ">~>`#rFv7y", false);
      Person person1 = new Person("", "male", false);
      person0.addChild(person1);
      assertEquals(2, person1.getId());
      
      Vector vector0 = person0.getChildren();
      assertEquals("[ male]", vector0.toString());
      assertEquals("male", person0.getGender());
      assertEquals(">~>`#rFv7y", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Person person0 = new Person("", "", false);
      Person person1 = new Person("", "cJ2qX{K>:k", true);
      person1.addChild(person0);
      boolean boolean0 = person0.removeRelation(person1);
      assertEquals("", person1.getFirstName());
      assertEquals(2, person1.getId());
      assertEquals("cJ2qX{K>:k", person1.getLastName());
      assertTrue(boolean0);
      assertEquals("female", person1.getGender());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      Person person1 = new Person("\"gcMirT", "male", true);
      person1.addSpouse(person0);
      assertEquals("0X!NN54n", person0.getLastName());
      
      boolean boolean0 = person1.removeRelation(person1);
      assertEquals(2, person1.getId());
      assertEquals("male", person1.getLastName());
      assertFalse(boolean0);
      assertEquals("\"gcMirT", person1.getFirstName());
      assertTrue(person1.isFemale());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      Person person1 = new Person("\"gcMirT", "male", true);
      Person person2 = Person.restorePerson(1, "male", "[oSv65;lU3h", false);
      person0.addChild(person2);
      person1.addChild(person0);
      person1.addSpouse(person2);
      assertEquals(2, person1.getId());
      assertEquals(1, person2.getId());
      assertEquals("\"gcMirT", person1.getFirstName());
      assertEquals("[oSv65;lU3h", person2.getLastName());
      assertEquals("male", person2.getFirstName());
      assertFalse(person2.isFemale());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      Person person1 = new Person("\"gcMirT", "male", true);
      person1.addSpouse(person0);
      Person person2 = Person.restorePerson(1, "male", "[oSv65;lU3h", false);
      person0.addChild(person2);
      person1.addSpouse(person2);
      assertEquals(2, person1.getId());
      assertEquals("\"gcMirT", person1.getFirstName());
      assertEquals("[oSv65;lU3h", person2.getLastName());
      assertEquals("male", person2.getFirstName());
      assertEquals(0, person2.getGenderAsInt());
      assertEquals(1, person2.getId());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Person person0 = new Person("C}6+4On4o_NdmGj", "C}6+4On4o_NdmGj", true);
      Person person1 = Person.restorePerson(0, "female", "male", false);
      person1.addSpouse(person0);
      try { 
        person1.addChild(person0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Relation exists or is illegal
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      try { 
        person0.addSpouse(person0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Relation exists or is illegal
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Person person0 = new Person("Father", "Father", false);
      int int0 = person0.getId();
      assertEquals("Father", person0.getFirstName());
      assertEquals(1, int0);
      assertEquals("Father", person0.getLastName());
      assertFalse(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Person person0 = new Person("", " ", true);
      String string0 = person0.getFirstName();
      assertEquals("", string0);
      assertEquals(1, person0.getGenderAsInt());
      assertEquals(" ", person0.getLastName());
      assertEquals(1, person0.getId());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-4599), 892, 1, 1673, 2065, (-4599));
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar0);
      assertEquals("0X!NN54n", person0.getFirstName());
      assertEquals(1, person0.getId());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-4599,MONTH=892,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1673,HOUR_OF_DAY=1673,MINUTE=2065,SECOND=-4599,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertFalse(boolean0);
      assertFalse(person0.isFemale());
      assertEquals("0X!NN54n", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Person person0 = new Person("", "FZqM}).WF*\"", false);
      String string0 = person0.toString();
      assertEquals(1, person0.getId());
      assertEquals(0, person0.getGenderAsInt());
      assertEquals(" FZqM}).WF*\"", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-4599), 892, 1, 1673, 2065, (-4599));
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar0);
      assertFalse(person0.isFemale());
      assertEquals("0X!NN54n", person0.getLastName());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-4599,MONTH=892,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1673,HOUR_OF_DAY=1673,MINUTE=2065,SECOND=-4599,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertFalse(boolean0);
      assertEquals("0X!NN54n", person0.getFirstName());
      assertEquals(1, person0.getId());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Person person0 = new Person("", "CA}", true);
      String string0 = person0.getLastName();
      assertEquals("CA}", string0);
      assertEquals("", person0.getFirstName());
      assertEquals(1, person0.getId());
      assertEquals(1, person0.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Person person0 = new Person("Father", "Father", false);
      assertEquals("Father", person0.getFirstName());
      
      person0.setFirstName("female");
      assertEquals("Father", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Person person0 = new Person("0X!NN54n", "0X!NN54n", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-4599), 892, 1, 1673, 2065, (-4599));
      person0.setDateOfBirth(mockGregorianCalendar0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, (-12), 1);
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar1);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=-12,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar1.toString());
      assertEquals(1, person0.getId());
      assertEquals("0X!NN54n", person0.getFirstName());
      assertEquals("0X!NN54n", person0.getLastName());
      assertFalse(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Person person0 = new Person("", "", false);
      boolean boolean0 = person0.isFemale();
      assertFalse(boolean0);
      assertEquals("", person0.getFirstName());
      assertEquals("", person0.getLastName());
      assertEquals(1, person0.getId());
  }
}
