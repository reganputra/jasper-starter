import java.util.Collections;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Main {
    private String traineeNewAgreementJourneyProgramName;
    private String letterNumber;
    private String signDate;
    private String representeeEmployeeNumber;
    private String representeeLegalName;
    private String representeePositionTitle;
    private String traineeName;
    private String traineeGender;
    private String traineeAlamat;
    private String traineeTempatTanggalLahir;
    private String traineeKtpNo;
    private String traineeAge;
    private String traineeContractStart;
    private String traineeContractEnd;
    private String pocketAllowance;
    private String pocketAllowenceTerbilang;
    private String transportAllowance;
    private String transportAllowanceTerbilang;
    private String rayaAllowance;
    private String rayaAllowanceTerbilang;
    private String otherAllowance;
    private String otherAllowanceTerbilang;
    private String daysOff;
    private String compassionateAllowance;
    private String compassionateAllowanceTerbilang;
    private String otherBenefit;
    private String otherLeave;
    private String scholarshipAllowance;
    private String scholarshipAllowanceTerbilang;
    private String prevScholarshipAllowance;
    private String prevScholarshipAllowanceTerbilang;
    private String learningHoursAllowance;
    private String learningHoursAllowanceTerbilang;

    // ===== Getters and Setters =====

    public String getTraineeNewAgreementJourneyProgramName() {
        return traineeNewAgreementJourneyProgramName;
    }

    public void setTraineeNewAgreementJourneyProgramName(String traineeNewAgreementJourneyProgramName) {
        this.traineeNewAgreementJourneyProgramName = traineeNewAgreementJourneyProgramName;
    }

    public String getLetterNumber() {
        return letterNumber;
    }

    public void setLetterNumber(String letterNumber) {
        this.letterNumber = letterNumber;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public String getRepresenteeEmployeeNumber() {
        return representeeEmployeeNumber;
    }

    public void setRepresenteeEmployeeNumber(String representeeEmployeeNumber) {
        this.representeeEmployeeNumber = representeeEmployeeNumber;
    }

    public String getRepresenteeLegalName() {
        return representeeLegalName;
    }

    public void setRepresenteeLegalName(String representeeLegalName) {
        this.representeeLegalName = representeeLegalName;
    }

    public String getRepresenteePositionTitle() {
        return representeePositionTitle;
    }

    public void setRepresenteePositionTitle(String representeePositionTitle) {
        this.representeePositionTitle = representeePositionTitle;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public String getTraineeGender() {
        return traineeGender;
    }

    public void setTraineeGender(String traineeGender) {
        this.traineeGender = traineeGender;
    }

    public String getTraineeAlamat() {
        return traineeAlamat;
    }

    public void setTraineeAlamat(String traineeAlamat) {
        this.traineeAlamat = traineeAlamat;
    }

    public String getTraineeTempatTanggalLahir() {
        return traineeTempatTanggalLahir;
    }

    public void setTraineeTempatTanggalLahir(String traineeTempatTanggalLahir) {
        this.traineeTempatTanggalLahir = traineeTempatTanggalLahir;
    }

    public String getTraineeKtpNo() {
        return traineeKtpNo;
    }

    public void setTraineeKtpNo(String traineeKtpNo) {
        this.traineeKtpNo = traineeKtpNo;
    }

    public String getTraineeAge() {
        return traineeAge;
    }

    public void setTraineeAge(String traineeAge) {
        this.traineeAge = traineeAge;
    }

    public String getTraineeContractStart() {
        return traineeContractStart;
    }

    public void setTraineeContractStart(String traineeContractStart) {
        this.traineeContractStart = traineeContractStart;
    }

    public String getTraineeContractEnd() {
        return traineeContractEnd;
    }

    public void setTraineeContractEnd(String traineeContractEnd) {
        this.traineeContractEnd = traineeContractEnd;
    }

    public String getPocketAllowance() {
        return pocketAllowance;
    }

    public void setPocketAllowance(String pocketAllowance) {
        this.pocketAllowance = pocketAllowance;
    }

    public String getPocketAllowenceTerbilang() {
        return pocketAllowenceTerbilang;
    }

    public void setPocketAllowenceTerbilang(String pocketAllowenceTerbilang) {
        this.pocketAllowenceTerbilang = pocketAllowenceTerbilang;
    }

    public String getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(String transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public String getTransportAllowanceTerbilang() {
        return transportAllowanceTerbilang;
    }

    public void setTransportAllowanceTerbilang(String transportAllowanceTerbilang) {
        this.transportAllowanceTerbilang = transportAllowanceTerbilang;
    }

    public String getRayaAllowance() {
        return rayaAllowance;
    }

    public void setRayaAllowance(String rayaAllowance) {
        this.rayaAllowance = rayaAllowance;
    }

    public String getRayaAllowanceTerbilang() {
        return rayaAllowanceTerbilang;
    }

    public void setRayaAllowanceTerbilang(String rayaAllowanceTerbilang) {
        this.rayaAllowanceTerbilang = rayaAllowanceTerbilang;
    }

    public String getOtherAllowance() {
        return otherAllowance;
    }

    public void setOtherAllowance(String otherAllowance) {
        this.otherAllowance = otherAllowance;
    }

    public String getOtherAllowanceTerbilang() {
        return otherAllowanceTerbilang;
    }

    public void setOtherAllowanceTerbilang(String otherAllowanceTerbilang) {
        this.otherAllowanceTerbilang = otherAllowanceTerbilang;
    }

    public String getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(String daysOff) {
        this.daysOff = daysOff;
    }

    public String getCompassionateAllowance() {
        return compassionateAllowance;
    }

    public void setCompassionateAllowance(String compassionateAllowance) {
        this.compassionateAllowance = compassionateAllowance;
    }

    public String getCompassionateAllowanceTerbilang() {
        return compassionateAllowanceTerbilang;
    }

    public void setCompassionateAllowanceTerbilang(String compassionateAllowanceTerbilang) {
        this.compassionateAllowanceTerbilang = compassionateAllowanceTerbilang;
    }

    public String getOtherBenefit() {
        return otherBenefit;
    }

    public void setOtherBenefit(String otherBenefit) {
        this.otherBenefit = otherBenefit;
    }

    public String getOtherLeave() {
        return otherLeave;
    }

    public void setOtherLeave(String otherLeave) {
        this.otherLeave = otherLeave;
    }

    public String getScholarshipAllowance() {
        return scholarshipAllowance;
    }

    public void setScholarshipAllowance(String scholarshipAllowance) {
        this.scholarshipAllowance = scholarshipAllowance;
    }

    public String getScholarshipAllowanceTerbilang() {
        return scholarshipAllowanceTerbilang;
    }

    public void setScholarshipAllowanceTerbilang(String scholarshipAllowanceTerbilang) {
        this.scholarshipAllowanceTerbilang = scholarshipAllowanceTerbilang;
    }

    public String getPrevScholarshipAllowance() {
        return prevScholarshipAllowance;
    }

    public void setPrevScholarshipAllowance(String prevScholarshipAllowance) {
        this.prevScholarshipAllowance = prevScholarshipAllowance;
    }

    public String getPrevScholarshipAllowanceTerbilang() {
        return prevScholarshipAllowanceTerbilang;
    }

    public void setPrevScholarshipAllowanceTerbilang(String prevScholarshipAllowanceTerbilang) {
        this.prevScholarshipAllowanceTerbilang = prevScholarshipAllowanceTerbilang;
    }

    public String getLearningHoursAllowance() {
        return learningHoursAllowance;
    }

    public void setLearningHoursAllowance(String learningHoursAllowance) {
        this.learningHoursAllowance = learningHoursAllowance;
    }

    public String getLearningHoursAllowanceTerbilang() {
        return learningHoursAllowanceTerbilang;
    }

    public void setLearningHoursAllowanceTerbilang(String learningHoursAllowanceTerbilang) {
        this.learningHoursAllowanceTerbilang = learningHoursAllowanceTerbilang;
    }

    public static void main(String[] args) {
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport("src/main/resources/report.jrxml");
            Main record = new Main();
            record.setTraineeNewAgreementJourneyProgramName("CIPTA CSO Relationship");
            record.setLetterNumber("Letter Number");
            record.setSignDate("Sign Date");
            record.setRepresenteeEmployeeNumber("Representee Employee Number");
            record.setRepresenteeLegalName("Representee Legal Name");
            record.setRepresenteePositionTitle("Representee Position Title");
            record.setTraineeName("Trainee Name");
            record.setTraineeGender("Trainee Gender");
            record.setTraineeAlamat("Trainee Alamat");
            record.setTraineeTempatTanggalLahir("Trainee Tempat Tanggal Lahir");
            record.setTraineeKtpNo("Trainee Ktp No");
            record.setTraineeAge("Trainee Age");
            record.setTraineeContractStart("Trainee Contract Start");
            record.setTraineeContractEnd("Trainee Contract End");
            record.setPocketAllowance("Pocket Allowance");
            record.setPocketAllowenceTerbilang("Pocket Allowence Terbilang");
            record.setTransportAllowance("Transport Allowance");
            record.setTransportAllowanceTerbilang("Transport Allowance Terbilang");
            record.setRayaAllowance("Raya Allowance");
            record.setRayaAllowanceTerbilang("Raya Allowance Terbilang");
            record.setOtherAllowance("Other Allowance");
            record.setOtherAllowanceTerbilang("Other Allowance Terbilang");
            record.setDaysOff("Days Off");
            record.setCompassionateAllowance("Compassionate Allowance");
            record.setCompassionateAllowanceTerbilang("Compassionate Allowance Terbilang");
            record.setOtherBenefit("Other Benefit");
            record.setOtherLeave("Other Leave");
            record.setScholarshipAllowance("Scholarship Allowance");
            record.setScholarshipAllowanceTerbilang("Scholarship Allowance Terbilang");
            record.setPrevScholarshipAllowance("Prev Scholarship Allowance");
            record.setPrevScholarshipAllowanceTerbilang("Prev Scholarship Allowance Terbilang");
            record.setLearningHoursAllowance("Learning Hours Allowance");
            record.setLearningHoursAllowanceTerbilang("Learning Hours Allowance Terbilang");

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Collections.singletonList(record));

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<String, Object>(),
                    dataSource);

            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
