package com.anaptecs.jeaf.generator.annotations;

/**
 * Enumeration defines the known types of changes.
 *
 * @author JEAF Development Team.
 */
public enum ToDoType {
  /**
   * Element should be changed to mandatory.
   */
  CHANGE_ELEMENT_TO_MANDATORY,

  /**
   * Element should be changed to optional.
   */
  CHANGE_ELEMENT_TO_OPTIONAL,

  /**
   * Element should be removed.
   */
  REMOVE_ELEMENT,

  /**
   * Element should be removed but has a replacement.
   */
  REMOVE_ELEMENT_WITH_REPLACEMENT,

  /**
   * Element should be deprecated.
   */
  DEPRECATE_ELEMENT,

  /**
   * Element should be deprecated but has a replacement.
   */
  DEPRECATE_ELEMENT_WITH_REPLACEMENT,

  /**
   * Element should be renamed.
   */
  RENAME_ELEMENT,

  /**
   * Element should be changed to multi-valued.
   */
  CHANGE_ELEMENT_TO_MULTI_VALUED,

  /**
   * Element should be changed to single-valued
   */
  CHANGE_ELEMENT_TO_SINGLE_VALUED,

  /**
   * Package of element should be changed.
   */
  CHANGE_PACKAGE,

  /**
   * Constraint on element should be tightened.
   */
  TIGHTEN_CONSTRAINT,

  /**
   * Constraint on element should be softened.
   */
  SOFTEN_CONSTRAINT,

  /**
   * Dependency should be added.
   */
  ADD_DEPENDENCY,

  /**
   * Dependency should be removed.
   */
  REMOVE_DEPENDENCY,

  /**
   * Element is not yet implemented.
   */
  NOT_YET_IMPLEMENTED,

  /**
   * Documentation should be updated.
   */
  UPDATE_DOCUMENTATION,

  /**
   * Change does not match to any of the types defined above
   */
  OTHER,

  /**
   * Type of change is unknown.
   */
  UNDEFINED;
}
