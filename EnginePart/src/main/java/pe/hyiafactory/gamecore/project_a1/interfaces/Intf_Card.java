package pe.hyiafactory.gamecore.project_a1.interfaces;

public interface Intf_Card {
    void setCardName(String cardName);
    void setCardImgNo(Integer cardImgNo);
    void setCardSkill(Integer cardSkill);
    void setCardLevel(Integer cardLevel);

    String getCardName();
    Integer getCardImgNo();
    Integer getCardSkill();
    Integer getCardLevel();
}