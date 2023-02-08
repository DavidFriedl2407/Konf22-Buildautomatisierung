package org.campus02.thenewsocialmedia;

public class SocialNetworkApp {
    public static void main(String[] args) {
        Profil susi = new Profil("susi.sorglos@test.com",29,"Susi Sorglos","5612",3900);
        susi.printPublicPage(AccessRoles.Platform);

        Profil max = new Profil("max.mustermann@test.com",31,"Max Mustermann","2341",2800);
        max.printPublicPage(AccessRoles.Self);

        susi.setFriend(max);
        susi.printPublicPage(AccessRoles.RegisteredCustomer);
    }
}
