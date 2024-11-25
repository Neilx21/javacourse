public class ResearchExpedition {
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    public ResearchExpedition(ExpeditionMember expeditionLeader, ExpeditionMember archivist, ExpeditionMember fieldResearcher) {
        this.expeditionLeader = expeditionLeader;
        this.archivist = archivist;
        this.fieldResearcher = fieldResearcher;
    }

    //get leader name
    public String getExpeditionLeaderName() {
        return expeditionLeader.getMemberName();
    }
    //get archivist name
    public String getArchivistName() {
        return archivist.getMemberName();
    }
    public String getFieldResearcherName() {
        return fieldResearcher.getMemberName();
    }
}
