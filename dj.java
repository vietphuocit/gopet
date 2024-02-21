public final class dj {
   public String a;
   public String[] a;
   public int a;
   public int b;

   public dj(int var1, String var2, String var3) {
      this.b = var1;
      this.a = var2;
      if (var3 != null) {
         var3 = this.a + ":_" + var3;
      } else {
         var3 = this.a + ":_";
      }

      this.a = gj.b.a(var3, bc.b - 40 - gg.p);
      if (this.a[0].length() > this.a.length()) {
         this.a[0] = this.a[0].substring(this.a.length(), this.a[0].length());
      }

      this.a = this.a.length * gj.b.a() - 1;
   }
}
