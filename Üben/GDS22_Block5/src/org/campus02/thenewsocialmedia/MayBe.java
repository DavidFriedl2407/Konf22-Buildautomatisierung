package org.campus02.thenewsocialmedia;

public class MayBe<X> {
   private X value;
   //private AccessRoles neededAccessRole;

    public MayBe(X value) {
        this.value = value;
        //this.neededAccessRole = AccessRoles.Externaluser;
    }
    public void deliverValue(AccessRoles accessor){
       switch (accessor){
           case Platform:
           case Self:
               System.out.println(value);
               break;
           case RegisteredCustomer:
           case Externaluser:
           case friend:
               System.out.println("forbidden");
               break;
           default:
               System.out.println("not allowed");
       }
    }
}
