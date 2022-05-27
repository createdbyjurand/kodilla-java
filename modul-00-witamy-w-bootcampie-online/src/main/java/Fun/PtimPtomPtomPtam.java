package Fun;

import static Shared.Display.displayTitle;

import com.google.gson.Gson;

public class PtimPtomPtomPtam {

  // Pizza K2:
  // 32cm - 34zl
  // 42cm - 46.50zl
  // 50cm - 63.50zl

  // Pizza 105:
  // 32cm - 32zl
  // 45cm - 44zl
  // 60cm - 63zl

  private static void ptimPtomPtomPtam(String company, double pizzaDiameterInCentimeters, double pizzaPrice) {
    double pizzaRadius = pizzaDiameterInCentimeters / 2;
    double pizzaArea = (double) Math.round((Math.PI * Math.pow(pizzaRadius, 2)) * 10000) / 10000;
    double priceForOneCentimeter = (double) Math.round((pizzaPrice / pizzaArea) * 10000) / 10000;
    System.out.println(
      company + ": " + pizzaDiameterInCentimeters + "cm, " + pizzaPrice + "pln, r=" + pizzaRadius + "cm, area="
        + pizzaArea
        + "cm2, price for 1cm2=" + priceForOneCentimeter + "pln");
  }

  public static void main(String[] args) throws java.lang.Exception {
    Gson gson = new Gson(); // Or use new GsonBuilder().create();

    int[] ints = {1, 2, 3, 4, 5};
    String[] strings = {"abc", "def", "ghi"};

    gson.toJson(ints);   //  ==> prints [1,2,3,4,5]
    gson.toJson(strings);//  ==> prints ["abc", "def", "ghi"]

//    String json = gson.toJson(target); // serializes target to Json
//    MyType target = new MyType();
//    MyType target2 = gson.fromJson(json, MyType.class); // deserializes json into target2

    displayTitle("---------- Kalkulator pizzy ----------");

    ptimPtomPtomPtam("105", 32, 34);
    ptimPtomPtomPtam("105", 45, 44);
    ptimPtomPtomPtam("105", 60, 63);

    ptimPtomPtomPtam(" K2", 32, 34);
    ptimPtomPtomPtam(" K2", 42, 46.50);
    ptimPtomPtomPtam(" K2", 50, 63.50);
  }
}
