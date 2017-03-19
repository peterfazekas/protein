<h1>Protein - Fehérje</h1>
<h2>Informatika érettségi emelt szintű feladat: 2006. május</h2>
<p>A fehérjék óriás molekulák, amelyeknek egy része az élő szervezetekben végbemenő folyamatokat katalizálják. Egy-egy fehérje aminosavak százaiból épül fel, melyek láncszerűen kapcsolódnak egymáshoz. A természetben a fehérjék fajtája több millió. Minden fehérje húszféle aminosav különböző mennyiségű és sorrendű összekapcsolódásával épül fel.</p>
<p>Az alábbi táblázat tartalmazza az aminosavak legfontosabb adatait, a megnevezéseket és az őket alkotó atomok számát (az aminosavak mindegyike tartalmaz szenet, hidrogént, oxigént és nitrogént, néhányban kén is van):</p>
<table>
<tr><th>Neve</th><th>Rövidítés</th><th>Betűjele</th><th>C</th><th>H</th><th>O</th><th>N</th><th>S</th></tr>
<tr><td>Glicin</td><td>Gly</td><td>G</td><td>2</td><td>5</td><td>2</td><td>1</td><td>0</td></tr>
<tr><td>Alanin</td><td>Ala</td><td>A</td><td>3</td><td>7</td><td>2</td><td>1</td><td>0</td></tr>
<tr><td>Arginin</td><td>Arg</td><td>R</td><td>6</td><td>14</td><td>2</td><td>4</td><td>0</td></tr>
<tr><td>Fenilalanin</td><td>Phe</td><td>F</td><td>9</td><td>11</td><td>2</td><td>1</td><td>0</td></tr>
<tr><td>Cisztein</td><td>Cys</td><td>C</td><td>3</td><td>7</td><td>2</td><td>1</td><td>1</td></tr>
<tr><td>Triptofán</td><td>Trp</td><td>W</td><td>11</td><td>12</td><td>2</td><td>2</td><td>0</td></tr>
<tr><td>Valin</td><td>Val</td><td>V</td><td>5</td><td>11</td><td>2</td><td>1</td><td>0</td></tr>
<tr><td>Leucin</td><td>Leu</td><td>L</td><td>6</td><td>13</td><td>2</td><td>1</td><td>0</td></tr>
<tr><td>Izoleucin</td><td>Ile</td><td>I</td><td>6</td><td>13</td><td>2</td><td>1</td><td>0</td></tr>
<tr><td>Metionin</td><td>Met</td><td>M</td><td>5</td><td>11</td><td>2</td><td>1</td><td>1</td></tr>
<tr><td>Prolin</td><td>Pro</td><td>P</td><td>5</td><td>9</td><td>2</td><td>1</td><td>0</td></tr>
<tr><td>Szerin</td><td>Ser</td><td>S</td><td>3</td><td>7</td><td>3</td><td>1</td><td>0</td></tr>
<tr><td>Treonin</td><td>Thr</td><td>T</td><td>4</td><td>9</td><td>3</td><td>1</td><td>0</td></tr>
<tr><td>Aszparagin</td><td>Asn</td><td>N</td><td>4</td><td>8</td><td>3</td><td>2</td><td>0</td></tr>
<tr><td>Glutamin</td><td>Gln</td><td>Q</td><td>5</td><td>10</td><td>3</td><td>2</td><td>0</td></tr>
<tr><td>Tirozin</td><td>Tyr</td><td>Y</td><td>9</td><td>11</td><td>3</td><td>1</td><td>0</td></tr>
<tr><td>Hisztidin</td><td>His</td><td>H</td><td>6</td><td>9</td><td>2</td><td>3</td><td>0</td></tr>
<tr><td>Lizin</td><td>Lys</td><td>K</td><td>6</td><td>14</td><td>2</td><td>2</td><td>0</td></tr>
<tr><td>Aszparaginsav</td><td>Asp</td><td>D</td><td>4</td><td>7</td><td>4</td><td>1</td><td>0</td></tr>
<tr><td>Glutaminsav</td><td>Glu</td><td>E</td><td>5</td><td>9</td><td>4</td><td>1</td><td>0</td></tr>
</table>
<p>Készítsen programot <em><b>feherje</b></em> néven, ami megoldja a következő feladatokat! Ügyeljen arra, hogy a program forráskódját a megadott helyre mentse!</p>
<ol>
<li><p>Töltse be az aminosav.txt fájlból az aminosavak adatait! A fájlban minden adat külön sorban található, a fájl az aminosavak nevét nem tartalmazza. Ha az adatbetöltés nem sikerül, vegye fel a fenti táblázat alapján állandóként az első öt adatsort, és azzal dolgozzon!</p>
<p>Az első néhány adat:</p>
<pre>
Gly
G
2
5
2
1
0
Ala
A
3
7
2
1
0
…
</pre></li>
<li>Határozza meg az aminosavak relatív molekulatömegét, ha a szén atomtömege 12, a hidrogéné 1, az oxigéné 16, a nitrogéné 14 és a kén atomtömege 32! Például a Glicin esetén a relatív molekulatömeg 2·12 + 5·1 + 2·16 + 1·14 + 0·32 = 75.</li>
</ol>
<p>A következő feladatok eredményeit írja képernyőre, illetve az <em>eredmeny.txt</em> fájlba! A kiírást a feladat sorszámának feltüntetésével kezdje (például: <code>4. feladat</code>)!</p>
<ol start="3">
<li>Rendezze növekvő sorrendbe az aminosavakat a relatív molekulatömeg szerint! Írja ki a képernyőre és az <em>eredmeny.txt</em> fájlba az aminosavak hárombetűs azonosítóját és a molekulatömeget! Az azonosítót és hozzátartozó molekulatömeget egy sorba, szóközzel elválasztva írja ki!</li>
<li><p>A <em>bsa.txt</em> a BSA nevű fehérje aminosav sorrendjét tartalmazza – egybetűs jelöléssel. (A fehérjelánc legfeljebb 1000 aminosavat tartalmaz.) Határozza meg a fehérje összegképletét (azaz a C, H, O, N és S számát)! A meghatározásánál vegye figyelembe, hogy az aminosavak összekapcsolódása során minden kapcsolat létrejöttekor egy vízmolekula (H<sub>2</sub>O) lép ki! Az összegképletet a képernyőre és az <em>eredmeny.txt</em> fájlba az alábbi formában írja ki:</p>
<p>Például: <code>C 16321 H 34324 O 4234 N 8210 S 2231</code></p>
<p>(Amennyiben a bsa.txt beolvasása sikertelen, helyette tárolja a G,A,R,F,C betűjeleket tízszer egymás után és a feladatokat erre a „láncra” oldja meg!)</p></li>
<li><p>A fehérjék szekvencia szerkezetét hasításos eljárással határozzák meg. Egyes enzimek bizonyos aminosavak után kettéhasítják a fehérjemolekulát. Például a Kimotripszin enzim a Tirozin (Y), Fenilalanin (W) és a Triptofán (F) után hasít.</p>
<p>Határozza meg, és írja ki képernyőre a Kimotripszin enzimmel széthasított BSA lánc leghosszabb darabjának hosszát és az eredeti láncban elfoglalt helyét (első és utolsó aminosavának sorszámát)! A kiíráskor nevezze meg a kiírt adatot, például: „<code>kezdet helye:</code>”!</p></li>
<li>Egy másik enzim (a Factor XI) az Arginin (R) után hasít, de csak akkor, ha Alinin (A) vagy Valin (V) követi. Határozza meg, hogy a hasítás során keletkező első fehérjelánc részletben hány Cisztein (C) található! A választ teljes mondatba illesztve írja ki a képernyőre!</li>
</ol>
<hr>
<h3>Források:</h3>
<li><a href="http://dload.oktatas.educatio.hu/erettsegi/feladatok2006tavasz/emelt/e_info_06maj_fl.pdf">Feladatlap</a>
<li><a href="https://www.oktatas.hu/bin/content/dload/erettsegi/feladatok2006tavasz/emelt/e_infoforras_06maj_fl.zip">Forrásállományok</a>