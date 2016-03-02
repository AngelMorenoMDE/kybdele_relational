/**
 *
 * $Id$
 */
package gmf_relational_model.gmf_relational_model.validation;

import gmf_relational_model.gmf_relational_model.LinkFK;
import gmf_relational_model.gmf_relational_model.Relation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link gmf_relational_model.gmf_relational_model.Schema}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SchemaValidator {
	boolean validate();

	boolean validateScontainsRelations(EList<Relation> value);
	boolean validateScontainsLinksFK(EList<LinkFK> value);
}
