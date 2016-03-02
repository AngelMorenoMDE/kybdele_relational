/**
 */
package gmf_relational_model.gmf_relational_model.tests;

import gmf_relational_model.gmf_relational_model.Gmf_relational_modelFactory;
import gmf_relational_model.gmf_relational_model.LinkFK;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link FK</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkFKTest extends TestCase {

	/**
	 * The fixture for this Link FK test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkFK fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkFKTest.class);
	}

	/**
	 * Constructs a new Link FK test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkFKTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Link FK test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LinkFK fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Link FK test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkFK getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Gmf_relational_modelFactory.eINSTANCE.createLinkFK());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LinkFKTest
