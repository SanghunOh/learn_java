package beans;

public class DataInfors {
    public MemberBean getDataWithMamberBean(){
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");

        return memberBean;
    }
}
