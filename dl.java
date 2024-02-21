import javax.microedition.lcdui.Image;

public final class dl extends ff {
   private Image a;

   public dl(Image var1) {
      this.a = var1;
   }

   public final void a() {
      int var1 = bc.a.getTranslateX();
      int var2 = bc.a.getTranslateY();
      bc.a.translate(-var1 + this.r, -var2 + this.s);
      bc.a.drawImage(this.a, this.t - this.a.getWidth() >> 1, this.u - this.a.getHeight() >> 1, 0);
      bc.a.translate(-(-var1 + this.r), -(-var2 + this.s));
   }
}
