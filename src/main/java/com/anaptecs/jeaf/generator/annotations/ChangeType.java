package com.anaptecs.jeaf.generator.annotations;

/**
 * Enumeration defines the known types of changes.
 *
 * @author JEAF Development Team.
 */
public enum ChangeType {
  /**
   * Element will become mandatory.
   */
  ELEMENT_MANDATORY,

  /**
   * Element will become optional.
   */
  ELEMENT_OPTIONAL,

  /**
   * Element will be added.
   */
  ELEMENT_ADDED,

  /**
   * Element will be removed.
   */
  ELEMENT_REMOVED,

  /**
   * Element will be removed but has a replacement.
   */
  ELEMENT_REMOVED_WITH_REPLACEMENT,

  /**
   * Element will become mandatory.
   */
  ELEMENT_DEPRECATED,

  /**
   * Element will be deprecated but has a replacement.
   */
  ELEMENT_DEPRECATED_WITH_REPLACEMENT,

  /**
   * Element will be replaced.
   */
  ELEMENT_RENAMED,

  /**
   * Element will be changed to multi-valued.
   */
  ELEMENT_MULTI_VALUED,

  /**
   * Element will be changed to single-valued
   */
  ELEMENT_SINGLE_VALUED,

  /**
   * Package of element will change.
   */
  PACKAGE_CHANGED,

  /**
   * Constraint on element will be tightened.
   */
  CONSTRAINT_TIGHTENED,

  /**
   * Constraint on element will be softened.
   */
  CONSTRAINT_SOFTENED,

  /**
   * Dependency will be added.
   */
  DEPENDENCY_ADDED,

  /**
   * Dependency will be removed.
   */
  DEPENDENCY_REMOVED,

  /**
   * Element is not yet implemented.
   */
  IMPLEMENTATION_REQUIRED,

  /**
   * Documentation was updated.
   */
  DOCUMENTATION,

  /**
   * Change does not match to any of the types defined above
   */
  OTHER,

  /**
   * Type of change is unknown.
   */
  UNDEFINED;
}
