/**
 * Cobast Datatypes
 * 
 * @authors @AdmiralCruz @Potatopowers @LordDomino
 * @version Pre-alpha ...
 */

package cobast;


public class Datatypes {
    public static void main(String[] args) {
        /**
         * Datatypes in cobast
         * 
         * 
         */

        // FormSection_A
        // Student
        String      vi_001, a_student_fullname;
        String      vi_002, a_student_firstname;
        String      vi_003, a_student_middlename;
        String      vi_004, a_student_middlename_initial;
        String      vi_005, a_student_lastname;
        String      vi_006, a_level_section;
        int         vi_007, a_gradelevel;
        String      vi_008, a_section;
        String      vi_009, a_address;
        String      vi_010, a_address_city;
        String      vi_011, a_address_brgy;
        String      vi_012, a_address_st;
        int         vi_013, a_address_bl;
        int         vi_014, a_address_lt;
        String      vi_015, a_birthdate;
        String      vi_016, a_birthday;
        int         vi_017, a_birthday_val;
        String      vi_018, a_birthmonth;
        int         vi_019, a_birthmonth_val;
        int         vi_020, a_birthyear;
        float       vi_021, a_age;
        float       vi_022, a_height_ft;
        float       vi_023, a_height_m;
        float       vi_024, a_weight_kg;
        float       vi_025, a_weight_lbs;
        //          vi_22-23 can be converted based on forms
        //          vi_24-25 weight conversion
        //          vi_15-19 can be converted to Date (more efficient) 


        // Mother
        String      vi_026, a_mother_fullname;
        String      vi_027, a_mother_firstname;
        String      vi_028, a_mother_middlename;
        String      vi_029, a_mother_middlename_initial;
        String      vi_030, a_mother_lastname;
        String      vi_031, a_mother_occupation;
        int         vi_032, a_mother_contactno;
        String      vi_033, a_mother_email;

        // Father
        String      vi_034, a_father_fullname;
        String      vi_035, a_father_firstname;
        String      vi_036, a_father_middlename;
        String      vi_037, a_father_middlename_initial;
        String      vi_038, a_father_lastname;
        String      vi_039, a_father_occupation;
        int         vi_040, a_father_contactno;
        String      vi_041, a_father_email;

        // FormSection_B
        // ContactPerson
        String      vi_042, b_contactperson_fullname;
        String      vi_043, b_contactperson_firstname;
        String      vi_044, b_contactperson_middlename;
        String      vi_045, b_contactperson_middlename_initial;
        String      vi_046, b_contactperson_lastname;
        String      vi_047, b_contactperson_relationship; // does not denote if "single" or "married"!
        int         vi_048, b_contactperson_contactno;

        // FormSection_C
        boolean     vi_049, c_question1;
        String      vi_050, c_question1_details;
        boolean     vi_051, c_checkbox_food;
        boolean     vi_052, c_checkbox_insectbite;
        boolean     vi_053, c_checkbox_medication;
        boolean     vi_054, c_checkbox_others;
        String      vi_055, c_if_true_checkbox_food_details;
        String      vi_056, c_if_true_checkbox_insectbite_details;
        String      vi_057, c_if_true_checkbox_medication_details;
        String      vi_058, c_if_true_checkbox_others_details;
        
        //          vi_55-58 used if true statement to prevent unnecessary details

        // FormSection_D
        boolean     vi_059, d_question1;
        boolean     vi_060, d_checkbox_vitamins;
        boolean     vi_061, d_checkbox_medicationforallergy;
        boolean     vi_062, d_checkbox_medicationforasthma;
        boolean     vi_063, d_checkbox_medicationforpresentpastillnesssickness;
        boolean     vi_064, d_checkbox_others;
        String      vi_065, d_checkbox_vitamins_details;
        String      vi_066, d_checkbox_medicationforallergy_details;
        String      vi_067, d_checkbox_medicationforasthma_details;
        String      vi_068, d_checkbox_medicationforpresentpastillnesssickness_details;
        String      vi_069, d_checkbox_others_details;
        
        //          vi_65-69 

        // FormSection_E
        boolean     vi_070, e_is_asthma;
        boolean     vi_071, e_is_g6pd;
        boolean     vi_072, e_is_stomachproblems;
        boolean     vi_073, e_is_diabetic;
        boolean     vi_074, e_is_lungproblem;
        boolean     vi_075, e_is_heartdisorder;
        boolean     vi_076, e_is_uti;
        boolean     vi_077, e_is_fainting_or_dizzy;
        boolean     vi_078, e_is_eyeproblem;
        boolean     vi_079, e_is_fracture;
        boolean     vi_080, e_is_allergicrhinitis;
        boolean     vi_081, e_is_eczema;
        boolean     vi_082, e_is_febrileseizures;
        boolean     vi_083, e_is_dengue;
        boolean     vi_084, e_is_pneumonia;
        boolean     vi_085, e_is_hfmd;
        boolean     vi_086, e_is_chickenpox;
        boolean     vi_087, e_is_measles;
        boolean     vi_088, e_is_wearingeyeglasses;
        boolean     vi_089, e_is_hearingdifficult;
        boolean     vi_090, e_is_otheractivemedicalconditions;
        String      vi_091, e_asthma_details;
        String      vi_092, e_g6pd_details;
        String      vi_093, e_stomachproblems_details;
        String      vi_094, e_diabetic_details;
        String      vi_095, e_lungproblem_details;
        String      vi_096, e_heartdisorder_details;
        String      vi_097, e_uti_details;
        String      vi_098, e_fainting_or_dizzy_details;
        String      vi_099, e_eyeproblem_details;
        String      vi_100, e_fracture_details;
        String      vi_101, e_allergicrhinitis_details;
        String      vi_102, e_eczema_details;
        String      vi_103, e_febrileseizures_details;
        String      vi_104, e_dengue_details;
        String      vi_105, e_pneumonia_details;
        String      vi_106, e_hfmd_details;
        String      vi_107, e_chickenpox_details;
        String      vi_108, e_measles_details;
        int         vi_109, e_righteye_details;
        int         vi_110, e_lefteye_details;
        String      vi_111, e_hearingdifficult_details;
        String      vi_112, e_otheractivemedicalconditions_details;
        String      vi_113, e_eyegrade;
        
        // FormSection_F
        boolean     vi_114, f_is_basicimmunization;
        boolean     vi_115, f_is_hepatitisB;
        boolean     vi_116, f_is_dtap;
        boolean     vi_117, f_is_polio;
        boolean     vi_118, f_is_rotavirus;
        boolean     vi_119, f_is_pcv;
        boolean     vi_120, f_is_chickenpox_varicella;
        boolean     vi_121, f_is_mmr;
        boolean     vi_122, f_is_hepatitisA;
        boolean     vi_123, f_is_flu;
        boolean     vi_124, f_is_others;
        String      vi_125, f_others_details;
        
        // FormSection_G
        boolean     vi_126, g_hascontractedcovid19;
        String      vi_127, g_hascontractedcovid19_if_true_details;
        String      vi_128, g_hascontractedcovid19_if_true_dates;
        String      vi_129, g_hascontractedcovid19_if_true_dates_day;
        int         vi_130, g_hascontractedcovid19_if_true_dates_day_val;
        String      vi_131, g_hascontractedcovid19_if_true_dates_month;
        int         vi_132, g_hascontractedcovid19_if_true_dates_month_val;
        int         vi_133, g_hascontractedcovid19_if_true_dates_year;             
        boolean     vi_134, g_undergonecovid19confirmatorytest;
        boolean     vi_135, g_undergonecovid19confirmatorytest_swabtest;
        boolean     vi_136, g_undergonecovid19confirmatorytest_saliva;
        boolean     vi_137, g_undergonecovid19confirmatorytest_others;
        String      vi_138, g_undergonecovid19confirmatorytest_other_details;
        boolean     vi_139, g_is_asymptomatic;
        boolean     vi_140, g_is_symptomatic;
        boolean     vi_141, g_havebeenquarantined;
        String      vi_142, g_havebeenquarantined_location;
        String      vi_143, g_totaldaysofisolation;
        boolean     vi_144, g_wasalreadyvaccinated;
        String      vi_145, g_wasalreadyvaccinated_if_false_reason;
        int         vi_146, g_wasalreadyvaccinated_if_true_dosecount;
        String      vi_147, g_wasalreadyvaccinated_if_true_firstdose_date;
        String      vi_148, g_wasalreadyvaccinated_if_true_seconddose_date;
        String      vi_149, g_wasalreadyvaccinated_if_true_brandname;
        boolean     vi_150, g_didreceiveboosterdose;
        String      vi_151, g_didreceiveboosterdose_if_false_reason;
        boolean     vi_152, g_didreceiveboosterdose_if_true_firstdose;
        boolean     vi_153, g_didreceiveboosterdose_if_true_seconddose;
        String      vi_154, g_didreceiveboosterdose_if_true_brandname;
        String      vi_155, g_didreceiveboosterdose_if_true_brandname_others;
        String      vi_156, form_datesubmitted;
        String      vi_157, form_datesubmitted_day;
        String      vi_158, form_datesubmitted_day_val;
        String      vi_159, form_datesubmitted_month;
        int         vi_160, form_datesubmitted_month_val;
        int         vi_161, form_datesubmitted_year;
    }
}