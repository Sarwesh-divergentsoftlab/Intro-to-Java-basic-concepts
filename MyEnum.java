public class MyEnum {
  public static void main(String[] args)
  {
      enum Tier{LOWEND,MIDTIER,FLAGSHIP};
      Tier tier = Tier.FLAGSHIP;
      System.out.println(tier);

      switch(tier)
      {
        case LOWEND:
        System.out.println("your system is very slow");
        break;

        case MIDTIER:
        System.out.println("your system has average performance");
        break;

        case FLAGSHIP:
        System.out.println("your system has highest performance");
        break;
      }
      System.out.print("We have these tier of systems: ");
      for(Tier tiers:Tier.values())
      System.out.print(" "+tiers);
  }  
}
