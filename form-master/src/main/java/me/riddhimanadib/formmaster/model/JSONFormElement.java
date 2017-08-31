package me.riddhimanadib.formmaster.model;

import java.util.List;

/**
 * Created by Nestor Islas on 31/08/2017.
 */

public class JSONFormElement {
    public int tag;
    public int type;
    public String title;
    public String value;
    public List<String> options;
    public String hint;
    public boolean required;
    public String alertTitle;
    public String positiveText;
    public String negativeText;
}
