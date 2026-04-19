/**
 */
package variant3.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import variant3.EnvironmentType;
import variant3.FlightSegment;
import variant3.RouteNode;
import variant3.Variant3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link variant3.impl.FlightSegmentImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link variant3.impl.FlightSegmentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link variant3.impl.FlightSegmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link variant3.impl.FlightSegmentImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link variant3.impl.FlightSegmentImpl#getWearTotal <em>Wear Total</em>}</li>
 *   <li>{@link variant3.impl.FlightSegmentImpl#getWearEngine <em>Wear Engine</em>}</li>
 *   <li>{@link variant3.impl.FlightSegmentImpl#getWearFuselage <em>Wear Fuselage</em>}</li>
 *   <li>{@link variant3.impl.FlightSegmentImpl#getWearLandingGear <em>Wear Landing Gear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightSegmentImpl extends MinimalEObjectImpl.Container implements FlightSegment {
	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected RouteNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected RouteNode target;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentType environment;

	/**
	 * The default value of the '{@link #getWearTotal() <em>Wear Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWearTotal()
	 * @generated
	 * @ordered
	 */
	protected static final double WEAR_TOTAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWearTotal() <em>Wear Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWearTotal()
	 * @generated
	 * @ordered
	 */
	protected double wearTotal = WEAR_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWearEngine() <em>Wear Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWearEngine()
	 * @generated
	 * @ordered
	 */
	protected static final double WEAR_ENGINE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWearEngine() <em>Wear Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWearEngine()
	 * @generated
	 * @ordered
	 */
	protected double wearEngine = WEAR_ENGINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWearFuselage() <em>Wear Fuselage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWearFuselage()
	 * @generated
	 * @ordered
	 */
	protected static final double WEAR_FUSELAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWearFuselage() <em>Wear Fuselage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWearFuselage()
	 * @generated
	 * @ordered
	 */
	protected double wearFuselage = WEAR_FUSELAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWearLandingGear() <em>Wear Landing Gear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWearLandingGear()
	 * @generated
	 * @ordered
	 */
	protected static final double WEAR_LANDING_GEAR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWearLandingGear() <em>Wear Landing Gear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWearLandingGear()
	 * @generated
	 * @ordered
	 */
	protected double wearLandingGear = WEAR_LANDING_GEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Variant3Package.Literals.FLIGHT_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.FLIGHT_SEGMENT__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (RouteNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Variant3Package.FLIGHT_SEGMENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(RouteNode newSource) {
		RouteNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.FLIGHT_SEGMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (RouteNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Variant3Package.FLIGHT_SEGMENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(RouteNode newTarget) {
		RouteNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.FLIGHT_SEGMENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentType getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (EnvironmentType)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Variant3Package.FLIGHT_SEGMENT__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentType basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment(EnvironmentType newEnvironment) {
		EnvironmentType oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.FLIGHT_SEGMENT__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWearTotal() {
		return wearTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWearTotal(double newWearTotal) {
		double oldWearTotal = wearTotal;
		wearTotal = newWearTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.FLIGHT_SEGMENT__WEAR_TOTAL, oldWearTotal, wearTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWearEngine() {
		return wearEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWearEngine(double newWearEngine) {
		double oldWearEngine = wearEngine;
		wearEngine = newWearEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.FLIGHT_SEGMENT__WEAR_ENGINE, oldWearEngine, wearEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWearFuselage() {
		return wearFuselage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWearFuselage(double newWearFuselage) {
		double oldWearFuselage = wearFuselage;
		wearFuselage = newWearFuselage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.FLIGHT_SEGMENT__WEAR_FUSELAGE, oldWearFuselage, wearFuselage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWearLandingGear() {
		return wearLandingGear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWearLandingGear(double newWearLandingGear) {
		double oldWearLandingGear = wearLandingGear;
		wearLandingGear = newWearLandingGear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant3Package.FLIGHT_SEGMENT__WEAR_LANDING_GEAR, oldWearLandingGear, wearLandingGear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Variant3Package.FLIGHT_SEGMENT__DISTANCE:
				return getDistance();
			case Variant3Package.FLIGHT_SEGMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Variant3Package.FLIGHT_SEGMENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Variant3Package.FLIGHT_SEGMENT__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case Variant3Package.FLIGHT_SEGMENT__WEAR_TOTAL:
				return getWearTotal();
			case Variant3Package.FLIGHT_SEGMENT__WEAR_ENGINE:
				return getWearEngine();
			case Variant3Package.FLIGHT_SEGMENT__WEAR_FUSELAGE:
				return getWearFuselage();
			case Variant3Package.FLIGHT_SEGMENT__WEAR_LANDING_GEAR:
				return getWearLandingGear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Variant3Package.FLIGHT_SEGMENT__DISTANCE:
				setDistance((Double)newValue);
				return;
			case Variant3Package.FLIGHT_SEGMENT__SOURCE:
				setSource((RouteNode)newValue);
				return;
			case Variant3Package.FLIGHT_SEGMENT__TARGET:
				setTarget((RouteNode)newValue);
				return;
			case Variant3Package.FLIGHT_SEGMENT__ENVIRONMENT:
				setEnvironment((EnvironmentType)newValue);
				return;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_TOTAL:
				setWearTotal((Double)newValue);
				return;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_ENGINE:
				setWearEngine((Double)newValue);
				return;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_FUSELAGE:
				setWearFuselage((Double)newValue);
				return;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_LANDING_GEAR:
				setWearLandingGear((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Variant3Package.FLIGHT_SEGMENT__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case Variant3Package.FLIGHT_SEGMENT__SOURCE:
				setSource((RouteNode)null);
				return;
			case Variant3Package.FLIGHT_SEGMENT__TARGET:
				setTarget((RouteNode)null);
				return;
			case Variant3Package.FLIGHT_SEGMENT__ENVIRONMENT:
				setEnvironment((EnvironmentType)null);
				return;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_TOTAL:
				setWearTotal(WEAR_TOTAL_EDEFAULT);
				return;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_ENGINE:
				setWearEngine(WEAR_ENGINE_EDEFAULT);
				return;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_FUSELAGE:
				setWearFuselage(WEAR_FUSELAGE_EDEFAULT);
				return;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_LANDING_GEAR:
				setWearLandingGear(WEAR_LANDING_GEAR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Variant3Package.FLIGHT_SEGMENT__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case Variant3Package.FLIGHT_SEGMENT__SOURCE:
				return source != null;
			case Variant3Package.FLIGHT_SEGMENT__TARGET:
				return target != null;
			case Variant3Package.FLIGHT_SEGMENT__ENVIRONMENT:
				return environment != null;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_TOTAL:
				return wearTotal != WEAR_TOTAL_EDEFAULT;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_ENGINE:
				return wearEngine != WEAR_ENGINE_EDEFAULT;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_FUSELAGE:
				return wearFuselage != WEAR_FUSELAGE_EDEFAULT;
			case Variant3Package.FLIGHT_SEGMENT__WEAR_LANDING_GEAR:
				return wearLandingGear != WEAR_LANDING_GEAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (distance: ");
		result.append(distance);
		result.append(", wearTotal: ");
		result.append(wearTotal);
		result.append(", wearEngine: ");
		result.append(wearEngine);
		result.append(", wearFuselage: ");
		result.append(wearFuselage);
		result.append(", wearLandingGear: ");
		result.append(wearLandingGear);
		result.append(')');
		return result.toString();
	}

} //FlightSegmentImpl
