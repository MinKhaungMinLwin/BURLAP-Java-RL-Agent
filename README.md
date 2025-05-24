Java RL Agent (BURLAP)

RL agent တစ်ခုကိုဆောက်တဲ့နေရမှာ python နဲ့ယှဥ်ရင် java ကိုအသုံးနည်းကျပါတယ်။  Stable Baselines3, Ray RLib တို့လို ပေါ်များတဲ့ ML ecosystem နဲ့ community support တို့ထက်စာရင် deep RL နည်းတဲ့ limited Java RL libraries လေးတွေကအားနည်းနေတာ‌ပေါ့။ 

ဒါပေမဲ့ robotics တို့ နာမည်ကြီး game engines တို့လို ရှိပြီးသား Java-based Infra တို့ကို စဥ်းစားမယ်ဆိုရင် java RL frameworks တွေကို မေ့ထားလို့မရပြန်ပါဘူး။


အဲ့ဒါကြောင့် classic java RL frameworks တစ်ခုဖြစ်တဲ့ BURLAP ကိုဒီမှာစမ်းသုံးကြည့်ရအောင်

Linux user တွေအတွက်မြန်လို့ ဒီ tutorial မှာ Window ဖက်ကိုအားဖြည့်ထားပါတယ်။


Java မရှိဘူးဆိုရင် ဒီ link Java Downloads | Oracle
Version အရမ်းမဟောင်းရင်ရပြီ


Build နဲ့ source code compile အတွက် Download Apache Maven – Maven


Apache ကို extract လုပ်ပြီးရင်  window ဖြစ်လို့ bin ရှိတဲ့လမ်းကြောင်းကို system environment variables ရဲ့ path ထဲလေးသွားထည့်ပေးရမယ်။

ပြီးရင် cmd မှာ mvn -v လို့  version စစ်ကြည့်လိုက်ရင် ဇာတ်လမ်းစလို့ရပါပြီ။




## 1.Project dir ဆောက်ဖို့ပါ
Mkdir HelloGridWorld
cd HelloGridWorld


## 2.Dependencies နဲ့ plugins အတွက် xml တစ်ခုလိုပါလိမ့်မယ်။ (IDE တစ်ခုဖွင့်ပြီးဆောက်လိုက်ရင်မြန်ပါတယ်)
pom.xml ကို အစောနက hellogrid အထဲမှာဆောက်, content တွေက video မှာပြထားပါတယ်


## 3.RL code ရေးမယ့် java code directory structure 
Mkdir -p src/main/java/project
	 Project folder အထဲမှာ HelloWorld.java ဖွင့်လိုက်ပြီး


## 4.BURLAP ကနေ singleagent အတွက် domain, Visualizer, WorldState, mdp state တွေ import သွင်း
Video ထဲက content မှာ gridworld, domain, state, visualizer နဲ့ autonomous မလုပ်ထားသေးဘဲ keymapping နဲ့ class ထဲမှာကြေငြာထားပါတယ်။


## 5@.Compile & Run
mvn compile
mvn exec:java -Dexec.mainClass=”project.HelloWorld”

လို့ run လိုက်ရင် ကျွန်တော်တို့ရဲ့  java rl agent ‌လေးကို ကြိုက်သလိုကလိလို့ရပါပြီ။


Project source code အတွက် https://github.com/MinKhaungMinLwin/BURLAP-Java-RL-Agent
Fork ပဲလုပ်လုပ် clone ပဲလုပ်လုပ် ကြိုက်သလိုယူသုံးလို့ရပါတယ်။

နောက်ပိုင်းဆိုရင်တော့ 3D နဲ့ robotics တွေအတွက်အရမ်းအဆင်ပြေလို့ Docker မှာပဲ OpenAI Gym ကို run တော့မှာပါ။


ဒီလိုမျိုး Python RL frameworks အကြောင်းတွေသိချင်ရင်တော့ ROM နဲ့ Deepblue ကိုလာမေးလို့ရပါတယ်။
