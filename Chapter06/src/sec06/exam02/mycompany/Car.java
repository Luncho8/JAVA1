package sec06.exam02.mycompany;

import sec06.exam02.hankook.*; //Tire
import sec06.exam02.kumho.*;   //BigwidthTire. Tire
import sec06.exam02.hyndai.Engine; //Engine
//import sec06.exam01.*;

public class Car {
	//필드
    Engine hyndai = new Engine();
    ShowTire tire1 = new ShowTire();
    BigwidthTire tire2 = new BigwidthTire();
    
    sec06.exam02.hankook.Trie tire3 = new sec06.exam02.hankook.Trie();
    sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}
