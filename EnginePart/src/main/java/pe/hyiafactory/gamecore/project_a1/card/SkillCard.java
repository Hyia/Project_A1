package pe.hyiafactory.gamecore.project_a1.card;

import pe.hyiafactory.gamecore.project_a1.interfaces.Intf_Card;

public class SkillCard implements Intf_Card{
    protected String cardName;
    protected Integer cardImgNo;
    protected Integer cardSkill;
    protected Integer cardLevel;
    protected Integer cardExp;


    public Integer getCardExp() {
        return cardExp;
    }

    public void setCardExp(Integer cardExp) {
        this.cardExp = cardExp;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardImgNo(Integer cardImgNo) {
        this.cardImgNo = cardImgNo;
    }

    public void setCardSkill(Integer cardSkill) {
        this.cardSkill = cardSkill;
    }

    public void setCardLevel(Integer cardLevel) {
        this.cardLevel = cardLevel;
    }

    public String getCardName() {
        return cardName;
    }

    public Integer getCardImgNo() {
        return cardImgNo;
    }

    public Integer getCardSkill() {
        return cardSkill;
    }

    public Integer getCardLevel() {
        return cardLevel;
    }
}