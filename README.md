件名（Subject）:
AIエンジニア職の応募について
宛先（Recipient）:
グローバルウォーカー株式会社
採用ご担当者様
本文（Body）:
拝啓
初夏の候、貴社ますますご清祥のこととお慶び申し上げます。
この度、貴社のAIエンジニア職の募集を拝見し、ぜひ応募させていただきたくご連絡申し上げました。
私は[Your University/Current Company]にて[Your Degree/Major]を専攻し、[X年間]のAI/機械学習プロジェクトの実務経験がございます。特に[Specific Skill, e.g., 自然言語処理、深層学習モデルの開発]に強みを持っております。
貴社の[Specific Project/Technology Mentioned in Job Posting]に大変興味を抱き、私のスキルと経験が貢献できると確信しております。
添付ファイルに以下を同封いたしましたので、ご査収いただけますと幸いです。
履歴書（日本語）
職務経歴書（日本語）
[その他、ポートフォリオ/GitHubリンク等]
何卒よろしくお願い申し上げます。
敬具
\


件名 : AIエンジニア職の応募について 

拝啓 

初夏の候、貴社ますますご清祥のこととお慶び申し上げます。 
現在御社で働いている友人から御社の AI 開発チームのことを聞き、ぜひ参加したいと思っています。
 私は[ ROM Dynamics, Deepblue AI Lab ]にて[ Engineering ]を専攻し、[3年間]のAI/機械学習プロジェクトの実務経験がございます。
特に[ 自然言語処理、深層学習モデルの開発 ]に強みを持っております。
 
貴社の[さまざまなAIスキル]に大変興味を抱き、私のスキルと経験が貢献できると確信しております。 
添付ファイルに以下を同封いたしましたので、ご査収いただけますと幸いです。
 履歴書  [その他、ポートフォリオ/GitHubリンク]  

何卒よろしくお願い申し上げます。 

敬具





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
