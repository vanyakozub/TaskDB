package taskDB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supervisors_by_teams", schema ="public")
public class SupervisorsByTeams {
    @Id
    private Integer id;
    @Column(name="adm_user_id")
    private Integer admUserID;
    @Column(name="team_id")
    private Integer teamID;
    @Column(name="is_deleted")
    private Integer isDeleted;

    public Integer getId() {
        return id;
    }
    public SupervisorsByTeams() {

    }
    public SupervisorsByTeams(Integer id, Integer admUserID, Integer teamID, Integer isDeleted) {
        this.id = id;
        this.admUserID = admUserID;
        this.teamID = teamID;
        this.isDeleted = isDeleted;
    }

    public Integer getAdmUserID() {
        return admUserID;
    }

    public void setAdmUserID(Integer admUserID) {
        this.admUserID = admUserID;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public Integer getOsDeleted() {
        return isDeleted;
    }

    public void setOsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupervisorsByTeams{");
        sb.append("id=").append(id);
        sb.append(", admUserID='").append(admUserID).append('\'');
        sb.append(", teamID=").append(teamID).append('\'');
        sb.append(", teamID=").append(isDeleted);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupervisorsByTeams that = (SupervisorsByTeams) o;

        if (!id.equals(that.id)) return false;
        if (!admUserID.equals(that.admUserID)) return false;
        if (!teamID.equals(that.teamID)) return false;
        return isDeleted != null ? isDeleted.equals(that.isDeleted) : that.isDeleted == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + admUserID.hashCode();
        result = 31 * result + teamID.hashCode();
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        return result;
    }
}
