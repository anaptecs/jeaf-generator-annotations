package com.anaptecs.jeaf.generator.annotations.test;

import com.anaptecs.jeaf.generator.annotations.Alias;
import com.anaptecs.jeaf.generator.annotations.Example;
import com.anaptecs.jeaf.generator.annotations.ToDo;
import com.anaptecs.jeaf.generator.annotations.ToDoType;

@ToDo(plannedChanges = ToDoType.UPDATE_DOCUMENTATION)
public class JEAFGeneratorAnnotationTest {

  @ToDo(plannedChanges = ToDoType.CHANGE_ELEMENT_TO_MANDATORY)
  @Alias(alternateNames = { "theMagicName", "My Former Name" })
  @Example(values = { "Jolly Jumper", "Lucky Luke" })
  private String myName;

  @ToDo(
      plannedChanges = { ToDoType.NOT_YET_IMPLEMENTED, ToDoType.RENAME_ELEMENT },
      description = "Implementation is still missing")
  public void testSomething( ) {
  }

}
