import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static java.util.Locale.lookup;

enum FieldType {
    PASSWORD(FieldType.passwordFieldName) {

        @Override
        public boolean validate(String fieldValue) {
            return fieldValue != null && fieldValue.length() > 2;
        }
    },

    EMAIL_ADDRESS(FieldType.emailFieldName) {

        @Override
        public boolean validate(String fieldValue) {
            return fieldValue != null && fieldValue.length() > 4;
        }
    },

    PHONE_NUMBER(FieldType.phoneFieldName) {

        @Override
        public boolean validate(String fieldValue) {
            return fieldValue != null && fieldValue.length() > 6;
        }
    },

    SOCIAL_SECURITY_NUMBER(FieldType.ssnFieldName) {

        @Override
        public boolean validate(String fieldValue) {
            return fieldValue != null && fieldValue.length() > 8;
        }
    };

    private String fieldName;

    static final String passwordFieldName = "password";
    static final String emailFieldName = "email";
    static final String phoneFieldName = "phone";
    static final String ssnFieldName = "ssn";

    private FieldType(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    abstract boolean validate(String fieldValue);

    private static final Map<String, FieldType> nameToFieldTypeMap = new HashMap<>();

    static {
        for (FieldType field : FieldType.values()) {
            nameToFieldTypeMap.put(field.getFieldName(), field);
        }
    }

    public static FieldType lookup(String fieldName) {
        return nameToFieldTypeMap.get(fieldName.toLowerCase());
    }

    public static void printValid(FieldType field, String fieldValue, boolean valid) {
        System.out.println(field.getFieldName() + "(\"" + fieldValue + "\") valid" + valid);
    }

}

public class Exercise398 {
    public static void main(String[] args) {
        String fieldName = FieldType.passwordFieldName;
        String fieldValue = "1Cxy9";
        FieldType field = FieldType.lookup(fieldName);
        FieldType.printValid(field, fieldValue, field.validate(fieldValue));

        fieldName = FieldType.phoneFieldName;
        fieldValue = "1-800-555-1234";
        field = FieldType.lookup(fieldName);
        FieldType.printValid(field, fieldValue, field.validate(fieldValue));

        fieldName = FieldType.emailFieldName;
        fieldValue = "john@doe";  // invalid - missing .<tld>
        field = FieldType.lookup(fieldName);
        FieldType.printValid(field, fieldValue, field.validate(fieldValue));

        fieldName = FieldType.ssnFieldName;
        fieldValue = "111-11-1111";  // valid
        field = FieldType.lookup(fieldName);
        FieldType.printValid(field, fieldValue, field.validate(fieldValue));
    }
}
