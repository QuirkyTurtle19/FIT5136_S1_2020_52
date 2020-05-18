import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Mission {
    private String missionId;
    private String missionName;
    private String missionDesc;
    private ArrayList<String> countriesAllowed;
    private String jobName;
    private String jobDesc;
    private int numRequired;
    private String journeyCargo;
    private String missionCargo;
    private String otherMissionCargo;
    private Date launchDate;
    private String destLocation;
    private Time missionDuration;
    private String missionStatus;
    private SelectionCriteria  selectionCriteria;
    private SpaceShuttle spaceShuttle;
    private ArrayList<Candidates> listOfCandidates;

    public void setMissionId(String newMissionId)
    {
        missionId = newMissionId;
    }

    public String getMissionId()
    {
        return missionId;
    }

    public void setMissionName(String newMissionName)
    {
        missionName = newMissionName;
    }

    public String getMissionName()
    {
        return missionName;
    }

    public void setMissionDesc(String newMissionDesc)
    {
        missionDesc= newMissionDesc;
    }
    public String getMissionDesc()
    {
        return missionDesc;
    }

    public void setCountriesAllowed(ArrayList<String> newCountriesAllowed)
    {
        this.countriesAllowed=newCountriesAllowed;
    }

    public ArrayList<String> getCountriesAllowed()
    {
        return countriesAllowed;
    }

    //get specific index
    public String getSpecificCountriesAllowed(int index)
    {
        return countriesAllowed.get(index);
    }

    public void setJobName(String newJobName)
    {
        jobName= newJobName;
    }

    public String getJobName()
    {
        return jobName;
    }

    public void setJobDesc(String newJobDesc)
    {
        jobDesc= newJobDesc;
    }

    public String getJobDesc()
    {
        return jobDesc;
    }

    public void setNumRequired(int newNumRequired)
    {
        numRequired= newNumRequired;
    }

    public int getNumRequired()
    {
        return numRequired;
    }

    public void setJourneyCargo(String newJourneyCargo)
    {
        journeyCargo=newJourneyCargo;
    }

    public String getJourneyCargo()
    {
        return journeyCargo;
    }

    public void setMissionCargo(String newMissionCargo)
    {
        missionCargo = newMissionCargo;
    }

    public String getMissionCargo()
    {
        return missionCargo;
    }

    public void setOtherMissionCargo(String newOtherMissionCargo)
    {
        otherMissionCargo=newOtherMissionCargo;
    }

    public String getOtherMissionCargo()
    {
        return otherMissionCargo;
    }

    public void setLaunchDate(Date newLaunchDate)
    {
        launchDate=newLaunchDate;
    }

    public Date getLaunchDate()
    {
        return launchDate;
    }

    public void setDestLocation(String newDestLocation)
    {
        destLocation=newDestLocation;
    }

    public String getDestLocation()
    {
        return destLocation;
    }

    public void setMissionDuration(Time newMissionDuration)
    {
        missionDuration=newMissionDuration;
    }

    public Time getMissionDuration()
    {
        return missionDuration;
    }

    public void setMissionStatus(String newMissionStatus)
    {
        missionStatus=newMissionStatus;
    }

    public String getMissionStatus()
    {
        return missionStatus;
    }

    public void setSelectionCriteria(SelectionCriteria newSelectionCriteria)
    {
        selectionCriteria=newSelectionCriteria;
    }

    public SelectionCriteria  getSelectionCriteria()
    {
        return selectionCriteria;
    }

    public void setSpaceShuttle(SpaceShuttle newSpaceShuttle)
    {
        spaceShuttle=newSpaceShuttle;
    }

    public SpaceShuttle getSpaceShuttle()
    {
        return spaceShuttle;
    }

    public void setListOfCandidates(ArrayList<Candidates> newListOfCandidates)
    {
        this.listOfCandidates=newListOfCandidates;
    }

    public ArrayList<Candidates> getListOfCandidates()
    {
        return listOfCandidates;
    }

    //get specific index
    public Candidates getSpecificCandidate(int index)
    {
        return listOfCandidates.get(index);
    }

    public static void main(String[] args)
    {
        Mission m = new Mission();
    }

}
