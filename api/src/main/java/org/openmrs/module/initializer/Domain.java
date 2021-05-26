package org.openmrs.module.initializer;

public enum Domain {
	
	JSON_KEY_VALUES(1, "jsonkeyvalues"),
	CONCEPT_CLASSES(2, "conceptclasses"),
	CONCEPT_SOURCES(3, "conceptsources"),
	MDS(4, "metadatasharing"),
	VISIT_TYPES(5, "visittypes"),
	PATIENT_IDENTIFIER_TYPES(6, "patientidentifiertypes"),
	LOCATION_TAGS(7, "locationtags"),
	PRIVILEGES(8, "privileges"),
	ENCOUNTER_TYPES(9, "encountertypes"),
	ENCOUNTER_ROLES(10, "encounterroles"),
	ROLES(11, "roles"),
	GLOBAL_PROPERTIES(12, "globalproperties"),
	ATTRIBUTE_TYPES(13, "attributetypes"),
	LOCATIONS(14, "locations"),
	BAHMNI_FORMS(15, "bahmniforms"),
	CONCEPTS(16, "concepts"),
	PROGRAMS(17, "programs"),
	PROGRAM_WORKFLOWS(18, "programworkflows"),
	PROGRAM_WORKFLOW_STATES(19, "programworkflowstates"),
	PERSON_ATTRIBUTE_TYPES(20, "personattributetypes"),
	IDENTIFIER_SOURCES(21, "idgen"),
	AUTO_GENERATION_OPTION(22, "autogenerationoptions"),
	DRUGS(23, "drugs"),
	ORDER_FREQUENCIES(24, "orderfrequencies"),
	ORDER_TYPES(25, "ordertypes"),
	APPOINTMENT_SPECIALITIES(26, "appointmentspecialities"),
	APPOINTMENT_SERVICE_DEFINITIONS(27, "appointmentservicedefinitions"),
	APPOINTMENT_SERVICE_TYPES(28, "appointmentservicetypes"),
	DATAFILTER_MAPPINGS(29, "datafiltermappings"),
	METADATA_SETS(30, "metadatasets"),
	METADATA_SET_MEMBERS(31, "metadatasetmembers"),
	METADATA_TERM_MAPPINGS(32, "metadatatermmappings"),
	HTML_FORMS(33, "htmlforms");
	
	private final int order;
	
	private final String name;
	
	Domain(final int order, final String name) {
		this.order = order;
		this.name = name;
	}
	
	public int getOrder() {
		return order;
	}
	
	/**
	 * The name of the domain is also the name of its subfolder inside the configuration folder.
	 */
	public String getName() {
		return name;
	}
}
