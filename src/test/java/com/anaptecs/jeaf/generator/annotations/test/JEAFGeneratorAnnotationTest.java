package com.anaptecs.jeaf.generator.annotations.test;

import com.anaptecs.jeaf.generator.annotations.ChangeType;
import com.anaptecs.jeaf.generator.annotations.JEAFUnderConstructionNotice;

@JEAFUnderConstructionNotice(
    plannedChanges = { ChangeType.IMPLEMENTATION_REQUIRED, ChangeType.ELEMENT_ADDED },
    description = "Implementation is still missing")
public class JEAFGeneratorAnnotationTest {

}
