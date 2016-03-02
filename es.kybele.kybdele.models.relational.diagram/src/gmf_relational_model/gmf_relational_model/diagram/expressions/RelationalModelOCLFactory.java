package gmf_relational_model.gmf_relational_model.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class RelationalModelOCLFactory {

	/**
	 * @generated
	 */
	private final gmf_relational_model.gmf_relational_model.diagram.expressions.RelationalModelAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected RelationalModelOCLFactory() {
		this.expressions = new gmf_relational_model.gmf_relational_model.diagram.expressions.RelationalModelAbstractExpression[11];
		this.expressionBodies = new String[] {
				"self.ScontainsRelations -> size() > 0", //$NON-NLS-1$
				"self.ScontainsRelations -> forAll(r1,r2 | r1 <> r2 implies r1.name <> r2.name)", //$NON-NLS-1$
				"self.type <> EGenericType :: UNDEFINED", //$NON-NLS-1$
				"not self.name.oclIsUndefined()", //$NON-NLS-1$
				"(self.isPK and self.isNN and self.isUN) or not(self.isPK)", //$NON-NLS-1$
				"self.containsAttributes -> size() >= 1", //$NON-NLS-1$
				"not self.hasPK -> isEmpty()", //$NON-NLS-1$
				"self.containsAttributes -> forAll(a1,a2 | a1 <> a2 implies a1.name <> a2.name)", //$NON-NLS-1$
				"not self.name.oclIsUndefined()", //$NON-NLS-1$
				"not(self.target.oclIsUndefined()) and ((self.target.containsAttributes -> exists(isPK))or(self.target.containsAttributes -> exists(isUN)))", //$NON-NLS-1$
				"(not (self.target.oclIsUndefined()))and(self.source ->size()>0)", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static RelationalModelOCLFactory getInstance() {
		RelationalModelOCLFactory instance = gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
				.getInstance().getRelationalModelOCLFactory();
		if (instance == null) {
			gmf_relational_model.gmf_relational_model.diagram.part.RelationalModelDiagramEditorPlugin
					.getInstance().setRelationalModelOCLFactory(
							instance = new RelationalModelOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static gmf_relational_model.gmf_relational_model.diagram.expressions.RelationalModelAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		RelationalModelOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static gmf_relational_model.gmf_relational_model.diagram.expressions.RelationalModelAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static gmf_relational_model.gmf_relational_model.diagram.expressions.RelationalModelAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			gmf_relational_model.gmf_relational_model.diagram.expressions.RelationalModelAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
