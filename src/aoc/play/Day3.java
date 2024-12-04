package aoc.play;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3 {

    public static void main(String[] args) {
        String input = "?% mul(948,148)why() %how(670,744)mul(590,32);where())#}from()>how()mul(611,372)}{~^?>from()^mul(835,665)who()]#^don't()select()select())mul(724,851)[>&mul(188,482)$mul(781,111)[who()<why(),!]mul(678,13)why()$#%who()mul(620,771)<!^}@^+what()mul(281,719)(]'what()where()>&from():!mul(147,678)how(){mul(938,510)where()!$?*['mul(103,563)where())mul(4,125)$*>>^mul(126,929)]& %~mul(161,418)who()>>do()]-''?mul(416,366)~?/where()]who()mul(459,47))>what(){@[(mul(219,400)+do()when()from():who()when()]&{{%mul(804,830)-select()what()*what()%}mul(861,992)who()!',mul(159,874)#<)''<mul(460,777)?mul(909,244)how()+what()]<do()?}mul(749,87)from()(who();why()mul(430,124)/$>how()@$%mul(214,139)&how()>mul(112,835)select()*from()@why()?[{mul(209,568)/; ~)mul(630,749):mul(841,589)/;who()>[mul(778,567)+when() how()<#mul(544,851)what(){+mul(327,103)from()what()/[~-mul(995,415)/when()-mul(880,153)}:}mul(368,920)'how()mul(864,419)from()what()@mul(208,291)who()<?}?what()',[{mul(575,454)*&(<{how()[mul(557,489){{why(){how()@who()~mul(423,703)mul(910,916)+what()^/<-*from()'mul(746,826),-*)/+>}^from()mul(154,571)++:>,mul(601,458)why()<;how()~from(172,16)mul(333,315)?[mul(513,260) {*mul(117,759)%]mul(77,644){($%>]&~mul(238,306)~select()from();-'who()'mul(460,352); ?select()>[[(from() mul(337,294)why()how()</$<where()don't()(?]{why()%}from()mul(367,653)~mul(910,873)^why()>mul(499,785)>what()[*:#where()*what()mul(765,210)*$[]mul(461,957)##)+}when()-@:mul(198,90)what()what()how()') )mul(258,966)]+(when()mul(535,417)where()!don't()@mul(939,319)?mul(751,538))! mul(758,675)~how()[how(),@>[where()when(29,965)mul(358,39){^what();/(where()how()mul(271,786)why():mul(792,761)do()$]%mul(740,232)>who(949,378)what()[(where()who(){who()#mul(595,343)%+mul(194,296)'mul(161,747): '{where(12,567),@mul(234,39)!+do()/who()[where()&'what()when()how())mul(138,925)),#;where()>{mul(738,864){mul(605,662)*when()%when()+( /~&mul(633,935)when()];mul(263/}*<!where(),- ~when()mul(512,798)]}where())when()who()mul(933,447)where()}mul(33,935*mul(15,975)mul(574,550)+#^;'$from(280,157)$^what()mul(919,849)@mul(18,160))$&^]how()what() when()where()mul(88,657):/from())+:/when()@]mul(71,74)from()'*:@{>mul(127,821)^how()$$select()select()@^{:mul(867,979)&%/>{%^how()what(499,657)+do()%what()(~;-:*mul(438,941)<]?]mul(208,834when()&^;]from()when(613,710)^}+$mul(809,573)mul^)*:from(379,983)mul(47,786)}when()-what()how(450,632)> where()how()mul(810,597 ;;{%(select()select()&,mul(356,249)from()/!{#&^mul(23,248)(!who()]-+,mul(873,987)]{what()<  )-{^mul(591,317)/mul(382,188)mul(476,338)*why()$]mul(865,625)who()})?select():*@[)don't()/ ,mul(737,418)select(318,357);+ what()<mul(41,445)mul(236,630)$}from()]$^$,(do()-select()mul(369,197)from()]#};^mul(561,752)+&#+}?}:mul(18,235)<'& ,(*mul(645,811)why()select()who()[>where()don't()%#>!>/@what()[mul(490,823)&^( ,'@ [do()@mul(855,491)*^why()[,mul(348,679)how()$who() '&how(16,459)/!;mul(43,422)#^from()![}select()mul(976,749)-}select()-where()select()mul(223,589)%[why()mul(868,881)mul(178,790)$,{who()from()#,mul(318,399):where()?[mul(182,864)where() mul(156,690) -]mul(857,353)#'%,},>?+@mul(914,528)where()$mul(785,748)<$who()[mul(453,859)%'@ mul(84,729)/{do()(?$<}mul(820,286)?:*?}#when()(%mul(245,958when()?from(),+mul(128,335)mul(463,102);:]@-~-%mul(914,398)\n" +
                "+mul(720,985)how(340,568)^!what()[),[mul(734,270)~')?who()]]mul(964,739)from()?who()$when() /mul(566,142)}*,?how()~mul(733,766)when()mul(319,914)when()mul(808,141)*@:&who();mul(736,736)where(){&!$when()]^mul(612,574)how()mul~]what()!!'[:mul(805,568),<^+~ #)&who()mul(810,729),[~/^<&mul(706,233)!-'{why(),(?&mul(28,746)%mul(127,170)-?} #don't()from(),[@,mul(282,734)mul(332,651)[:~mul(771,888)#who()^select(110,751)>who(){mul(655,334)why()+~&}mul(129,762)mul(597,498))*~-}who()who()~'$mul(235,859)where()^-,,@mul(661,707)[ ~,<-mul(502,445)?why(){why()from()-how()*>&mul(237,280)how()mul(669,512)#$< mul(426,417)[what()why()~select()*%,'where()mul(213,617)##>mul(148-how()&]mul(437,581)who()'<from()>%[:how()mul(985,24);mul(446,704)who(),mul(549#}%>[mul(58,502)%mul(55,502)~<where()''who()}<mul(678,579)mul(457,825)+how()from()'(*#+$$mul(266,507)mul(925,485)^why()mul(605,592)[}<>^<mul(173,922)@:<where()/-]'mul(110,899%select()why()why()>[%%;mul(63,642)>how())<*{mul(155,625)]mul(238,47)where()&@mul(630,112)who() mul(570,946)mul(299,320){({mul(307,251)%[]$%mul(621,739)^!}{^-+what())mul(350,650)!>who()what()]^,*mul(154,394)&?^mul(410,870)[-select()why()<who():+%don't()where()$]/when() how()when()mul(708from()]&?mul(589,972)*mul(167,814)[mul(807?%don't()])?'(who()mul(614,926)mul(404,930)'?+;mul(252how()^who(529,21)'who()%mul(675,37)mul(362*what(640,926)select()'?what(){'>mul(744,141)why():))from()^select()what()mul(991,854){-]+mul(64,859))~>>%>%select()#-mul(282,835)'select()'%<$!from(299,765)don't()-'mul(352,659),mul(366,409),when()mul(672,590)#@#}/(##  mul(550,937)$#/^~mul(458,447)mul#(,/<mul(538,275)}where()'?'!-)mul<^>(how(),mul(465,230)^select()$<from(595,221):mul(704,141)what()]when()^select()^)^%'mul(260,350)>how()what()#@};(from()~mul(716,318)from()+]<!?mul(625,41)#[,~ /mul(19}mul(760,4)@how()mul(508,977)@select())][[mul(261,452 $mul(11,905)how(731,838)[mul(823,988)?!?@&&'mul(929,818)(>mul(701,784)!;>do()'&)when()select()mul(945,704)mul(250,874)who()]@don't()why(51,895)-,how()*+{why()%/mul(964,293)&<^where()<select();&mul(900,32)]where()$from()&#from()who()({mul(755,539)mul(26,466)how()$when()%&$~)mul(926,673)$what()!select(),do()~select()#^mul(272,306)~%'mul(22,647)$mul(904,943)^>-from()mul(635,212)when()how()[mul(314,335)%(-  + ~mul(635,915)~[[do(){where(307,78)(who()(why()where();mul(450from()mul(903,662)>$mul(924,200),why()select()$mul(418,533)where()[where()mul(266,643):~^/#(:[from()mul(81,715),who()@:~+who()'%mul(79?who()select();# mul(436,105)#*why() #~[,where()'mulwho()[(~)[mul(119,92)]where(),select()why()?mul(639,691):+<why()why()mul(815,366)*where()-what()/?>mul(188,19)who()(select()what()mul(916,808));~mul(630,228)-)where()[~mul(586/[how()+~!>}>[how()mul(106,235)do()>why(416,339):mul(788,357)[when(442,691)what()how()where()$from()who()mul(471,832)]/*mul(837,328)<)>!mul(389,633)'from(),mul(70when()!from()select()$](when()*%mul(903,43)where(62,223)^from();@()mul(852,198)-when()?mulhow(168,455)(select()how();from()/mul(918,330)what()'how(215,263)$:{~how()*mul(136,552)from(363,441)-when()how()what()-+mul(229,899)!where()when()from(){mul(47,875)~mul(500,586)/&&where(),where()mul(571,252))%}^~when()mul(979,493)do()@!+~>^mul(568,461)]where()$who(){from();mul(743,403)@?[mul(117,954))/mul(382,589)<:what() mul(578,730)#/<,when()#)select()}mul(889,462){how(562,136)select()when()^>mul(150,815)/$from()?what()mul(842,604)**?'-^>;~'mul(622,493)\n" +
                "mul(901,810)[<,^$do()<#why()<why()},,select()mul(257,221)mul(393,412)-from()&$]mul(198,284)/>;/why()mul(296,969)@mul(224,163)#<$what():,what()mul(995,485)$~)who()mul(382,831)'&~mul(146,234)mul(228,532)mul(944,430)!!who()<;'$(%do()%'{mul(588,828)~$why():where()mul(753(select()/':~$[mul(785,897)/<(#$)@mul(821,858)$what()+@/*mul(545,209)where();what()mul-why()>mul(808,588),where()];;}mul(431,815)<<;how()?@why()(^don't()select()$)!mul(832,43)what()[where()mul(935,377)from()++where()$-]@mul(793,489)*&mul(910,985)mul(340,122);from(87,683)[[]]'mul(659>from()['from()~,;@:^mul(420,510)/mul{from()$ >! -mul(508,275)!()@+{!mul(134,503)how()?mul(717,994)@}what()}[@<do()~'[??from() #&}mul(443,258)){do()^mul(894,293),@from()mul(470,736)/select()where()from()how()mul(769,763)/-'mul(436,853)from()mul(955,870);#why()how()how()mul(807,205)#do()select()<@$when()*select()>mul(899,477)who(88,557){[?-mul[how()>>@mul(113,239)&;?what(825,719)from()}@mul(717,829)when()who()%@what()when()#':mul(644,495)]^$ >[~don't()!#mul(175,323)><$>do()[[$what()/>(#~mul(976,792))what()#{how()-$?mul(534,805))what()@mul(600from()'from()mul(859,367)from()mul(852,796)?{[]/'~mul(624,853($:;^mul(522,963)+mul(143,246)[,what()#*when()',why()mul(435,720)mul(812,909)'<? /;when()}*how()do()mul(49,504)how()when()/!mul(799,134)$mul(213,950)from(182,488)];]do()mul(325,689)(@mul(485,128)who()mul(376~when()(%-what()(mul(776,635)#: from(788,757)}mul(997,619)-from(919,426)where()where()how() mul(370,735)*what(),*%$mul(408,722)}#mul(990,90)(<where()*don't()*@:(;what()%:*#mul(804,562)mul(162,269)]mul mul(267,461)%#{(};^~[mul(124,671) ~-<$<from()<from()mul(401,89)>&!!who()how()/,who()>mul(179,82))]don't()@(}<who()where()%<from()]mul(950,333) }&mul(420,707)mul(293,223)what()(/mul(131,775)>@<mul(498,349)mul(416,808)*how(676,683)select()&@mul(100,528)'&from()/[<,%>!mul(224,804'}-mul(180,723)#+@mul(144,160 +#<]where()+!from()select()(mul(614,183)mul(123,655)*+##mul(744,352):#$when()~&,what(625,950)select()'mul(468,293)*]+#mul/$why()where(623,670)%@;mul(722,469)&(%;do()) from()mul(557,124)/}:mul(928,793>]how(){?who()'<mul(74,894)%mul(312,960)'(,]%^mul(560,307<where();when()}how()%>[mul(624,959)&mul(765,13):who()<),who()& mul(639,802)&;(@:why(988,378):mul(677,987)~@-! ;!^do()mul(29,935)mul(134,862)when()+{what()when()who()}~why()mul(541,335)who()@[<mul(342what()select()who();mul(833,47)when()%@}${why()mul(891,370)(@*@[^mul(652,523)}why()&-(?'*mul(906,962) )mul(691,622)~(!<--when(506,845)</$mul(603,406)'how(83,339)mul(44,583)<:-^/why()mul(812,857$what()<-:$]what()?mul(226,418)!>'+why();when()&mul(127,948)$mul(485,474))?$mul(278,206)select()mul(641,623){} @{*where()'?mul}>mul(792,193) [#;*%->~what()mul(876,897)/@+'mul(341,837)^)why()?;@+^^~mul(718,922)[why()when()/,{}select()who())mul(941,117)/}/who()why(293,857))mul(414,482)what()! how()who()mul(910,766)!]what(),how()*mul(6,611)~;{who()who()[--mul(720,952)why(546,471)!)from()/?mul(971,461)}&/$@'mul(452,187)#who():(mul(44,298)mul(530,770)']:who()&$from()mul(544,752)mul(375,827))&@select()^;who()where()how()mulselect()^%^,/&mul(204,187)when()&,}$(who();mul(60,317)+who()$from()(how(942,734);@mul(239,338)!?:%)}@select()(mul(284,525)select()what()where()@^#~[mul(718,185)&!*{';when()@when()mul(272,161)how()%how()?mul(66,988)@)@,::>)mul(930,190)why(),~when()%<@&where(),mul(143,136)why()-,/*-what()+mul(73,408)~ who()%*select()'+where()#!/usr/bin/perlmul(379,680)\n" +
                ";@mul(257,25)[!mul(646,635)>?who()who()from()mul(25,275(select()+why()%mul(102,254)%}/where()$mul(608,18)when()*#mul(343,951) mul(337,866)*^?#@why(805,831)-mulwhen()from()mul(854,5)when()@$why()mul(896,11)^mul(451,271)'how()?who()?)<%[}don't()who()/[{]-?from()when()?mul(198,238)])mul(750,760)+/-!what()~?#mul(880,271)%?select();where()(<^select()mul(373@from()where(),mul(700,15),mul(406,120)mul(551,206)mul(636,315);+{mul(261,201)mul,:-/&mul(267,217)/,'mul(132,410)@@;;who()when()]do()why()mul(4,121)#from()/mul(242what()how(277,558)<how()from()+:who()from()what()when()mul(27,714)who()why()what()mul(676,758)+^@*'}mul(274,109)-}]),select()*when()]why()mul(60,516)when()when(708,630)%%where():mul(34,59)from()#]how()+who()%who()*don't()select()&~(;where()/mul(548,869)&mul(439,68)]@}%)~&mul(46,712)when()+[&]where(),+mul(940,261)^who()where()mul(655,165) >'how()how(){mul(12,537)&[>}mul(322,676)[#,do()@,mul(248,663),when()-do()^what()]when()who()what()how())mul(864,73)how()?]*mul(653,55)when()from()from()how()@ }mul(94,590)]~what()mul(164,505)]from()when()]mul(218,565)(from() why()[*when()}[mul(306,447)*]][> #mul(783,715?)+^~mul(308,994):<*~)>from()why()*mul(508,139)>from()@;+~#mul(652,903)#[/?mul(407,208]how(){when(),**@*:/mul(849,965)mul(69,198<'#%[?mul(236,808)what()from()%from()why()^/,don't()select()&where()@mul(888,101) mul(332,775)who()):select()),:-mul(119,209)%how()mulfrom()select()don't(){mul(838,613)why() '({*<!mul(372,376)mul(407,117$who()[ mul(171,741)where();mul(742,142)mul(34#^+:who()mul(157,514)>~>*mul(466,106)mul(883,754->(%%who()[!mul(587,792)'((!?select()&}<mul(791,734){how()&;+<(mul(655,63):why(){!{)mul(320,950)->-'#)why()#[mul(234,162),what(497,671)why()#mul(985,797)>}~;from()select()mul(117,492)&~+from()]%>*$&mul(451,669))}'/@how()?where()why(694,295)'mul(676,756){~;select()what()}what()^}mul(963,857);%/how()?mul(944,194);select()<&^how(){->mul(195,702))?select()why()&~%}why()#mul(90,304)@%why(673,634)*/where()- <:do(){}!mul;who()]where()]-@?<mul(919,817),>when()how()how()>mul(875,604)select()%do()%mul(790,136)*$,mul(853,95)[how()>!%?mul(246,573)&!what()/#from()!mul(382,307),!#[-mul(32,733)$+[*mul(192,47)(@who()mul(304,303)@mul(167,528):select())!:how(){what()(}mul(933,177))#>$#,$:mul(81,603)<mul(40,227)mul(717,937)mul(853,848)mul(66,164)where())^<>what()?how()when()mul(206,607)<where()[$)}when()how()select()*mul(265,447)*/what())%+'[ from()mul(358,747)what()+%how()#from():,what()@mul(791,401)~where()[mul(990,778)?~[!:>!'^mul(666,852)mul(651,206)!+]}from()don't():*]#what()mul(359*%who()^)'mul(190,764)who()when()}select()~(~mul(547,102)mul(406,618)%when()>)<mul(822,907)?/[/from()mul(945,506)>![#mul(890,746)#who()$'~%]',+mul(341,395)who()--mul(285,533)}how()@<}!mul(715}>+~ select()where()$ (mul(894,62)?]}who()&when(652,875)%:}from(24,82)mul(713,250))-^{*%mul(548,903)&]]<]why(){from()when() mul(796,100)-(how()$%~mul(589,969)  :who()  @mul(271,734)<}mul(761,8)}@['- ['$mul(178,28)who()who(282,161)@$from()mul(413,253)#when()?(mul(585,394))select():$?#?>who()?mul(245,344)who()^who()where()why()~@why()don't()why()how()who(450,27)who()(!mul(951,644):select()-)%?*don't(), mul(189,841)]* why()*>'mul(758,690)what()<select()~>@>mul(728,932)how()?select()what()}mul(716,985){where()who()+who():mul(840,772)%how()>:;where()mul(139,830)$select()),mul(730,4)when(305,277);[$!,)mul(278,740)who(856,922)who()#<where()*>mul(212,541)((]mul(689,475)mul(814,611)'}&~{~~mul(716,817)who()mul(21,315))don't())(why()')$<mul(541,349)\n" +
                "$)mul(257,544)+where()how()-[how()^+ mul(986,808){[<why()%!;mul(940,137)who()-+(from()**^mul{>)who()how()?%why()}!<mul(908,379)select(811,438)mul(15,196)from(623,826)-from()+!mul(38,667){>{<{mul(41,189)-<how()*%when()}what(539,203)]mul(813,528)who())why()( ]how()why()how(){mul(299,367)]{[(@^mul(131,889)?:&who())when()'why()$&mul(728,552)^}when()@~mul(842,113)from()),?{!mul(811,809)*how(15,189)#>&+from(544,351)~&mul(516,38)]?;-@?don't()@}*mul(792,426when();#~ >%why()(/$mul(755,392)*(#]where()@select(),^select()mul(630]>*who(267,517)why()-;(mul(176,492)select()from()}~:who()mul(761,226)&,((mul(750,451)@/%select()from()mul(345,75)what()/who(); ~mul(431<)&mul(693,289)?~/mul(693,335)'mul(475,545){(*+~ mul(668,535)how()don't()?,<@mul(980,251)*why()$when()*-)mul(886,969):?/':]}-who()(mul(686,683)#}+($why()mul*^*$){&-(mul(94,775)- @when()?%]{when()mul(376,100)''/,&]^<mul(853,752)when()%who(),[^@where()!do()who()when()how()when(474,246)mul(318,180)do()%~(mul(216,96) ;}]why(907,964)$+when(680,212)?mul(442,979)why()what();##select()%mul(34,342)mul(641,907)@]who()@^:^mul(648,605)how()<}]when()!mul(567,219)?where()$what()~+from(),%how()mul(549,85)$-&(mul(94,269)~how(811,581)who(596,80)-how()~mul(510,591)mul(586,482)who()?#-<[[select()*}mul(249]{%<,where()*~^mul(628,294)]+what())why()mul(312,879&,?+don't()mul(100,514)when()select()mul(621,918)@select(813,295)/{^'%+mul(239,859) ']<*)mul(868,763)where()[/when()@)#{^mul(209,999)how()do()*#}},},&>mul(70/:from(184,559)>mul(679,138))<mul(454,112)[@)-?*where()mul(573,473)[(-/mul(867,232)~]/^/!'&where()mul(391,655)[%'mul(73,32)/{->)(~mul(929,872)'%#)mul(563,750)>(mul(324,725)what()why()[@$mul(186,770)?mul(719,251)[mul(270,934)+>when()'$when()mul(647,486)how()from(947,190),!(?mul(113,517) %[select()what()^)!mul(299,591)]:@' *where(145,530)/mulwhen()mul(811,260)mul(80,605)  where(296,197))])>from()mul(324,361)select(){[/';/},mul(648,947&how(){who()/'-%*]mul(949,359){mul(288,162)&];&:^mul(188,899)select()where()]%mul(248,30)#[&+'why()'') don't()][}& mul(808,221)what()@>><;>*mul{;>what()what()+mul(646,752)select()<from()why(211,37)~~~:mul(196,842)}where(690,849)where()[$select(571,536)how()from()<mul(6,129)what()what()?]]how()mul(116,23)who(205,335)>)'where()!mul(748,585)>?<##mul(381,399)mul(597,746)) *mul(881,573)/:({why()'mul(527,57)@/what()?mul(395,551)%who()when()%'mul(713,766)[<mul(749,438)'(}^when();{mul(43,565)what()% #mul(653,209)what():!-mul(64,870)#from()select()from()mul(206,327)?(mul(678,256)^{mul(311,65)who()when()<(when()mul(552,622)*how()%?~;:;;)mul(767,192)--&$mul(512,806)['?')who()mul/({what()&/#'!mul(811,828)]select()~@!/(}$)mul(683,153)&}&~how()from()mul(815,380),?$*+mul(133,342)mul(867,908)!;&why()?(+!mul(915,100))when(895,91)&select()!({where(758,740)mul(759,261)-from()&])mul(365,436)from()&' &^mul(541,400)~from()-what()!mul(679,638)mul(107^#,%~#>[)*select()mul(313,218))when()when()mul(360,494<-select():::- [/mul(517,923)*from(),from()how()+]mul(870,559)}{*?do()>~mul(704,518)where()!)select()?from()where()&'do();mul(270,449)~[*mul(774,600)how():>why()[!when()mul(338,711){]mul(962,193)*where()#![-+mul(511,924):[who()why()}mul(252,534when())when()when()()'!why(230,750)-mul(543,358)~~ -mul(394,506){mul(176,192)who()from()%@mul(181,776)%[ don't()when()where(229,174)+}@who()where()]>mul(553,452)@{/mul(790,202)&&-]mul(783,999)'mul(123,410)<,#what()}how()when()from()$~mul(674,974)why()#>do()'[$]}when()mul(907,824)from()select(){what()mul(584,273)#<>>do()mul(767,778)how()how()from()[#<$from()how()>mul(133,565):mul(888,792)\n" +
                "who()where()don't()]mul(891,277)~mul(160,638)('don't()/@/%{mul(462,975)!^:+mul(317,407){who()/from()/mul(424,628) when()select()mul(415,352)!?[where(){?how()/mul(661^, -mul(141,973)(/where()!#who()(what()#$mul(916,889)when()$ )mul(945,846)why()+#where()@how()mul(147,694)%select()mul(414,149)< when(){)what()&[how()mul(903,731)~#mul(389,694)mul(72,447)mul(490,881)?++from()>+ ^(mul(703,722)mul(622,578)from() }@^)+mul(642,732)>from()where()@>${who()mul(526,211$why()[why()mul(349,908)who(635,389)from()what()*$*>@mul(180,150)//: ^mul(622,131);[-^~-mul(32,430)mul(306,173)~where()how() (mul(292,552)<mul(422,363)^<<!#when(304,583)who()mul(348,963)': #select(875,567)#>'where()!do() why()~] who()@^mul(20,119)?[$+/$^mul(242,536)who()'-&'from()mul(351,640){,]~mul(152,587)@select(140,751)<+mul(387,212)[where()%when())how()& >mul(916,539)~]?[when()>!when()??mul(322,151)!]!]~!;mul(27,537); ##;^}}mul(538,277)why()mul(205,526)mul(412,826)^@?where()'mul(957from(193,394)from(863,680)!@how()mul(771,563)( who()mul(377,655) ]select();who()mul(360,272)-select()$what(){mul(291,618)})from()^when(),how()where()don't()why()+&mul(462,803)^$,mul(788,584)@ %?:![:mul(439,528)mul(129,761)]!~mul(321,102)mul(41,728){&what()how()mul(93,933))[ where()^*@+mul(553,965select() '&{-mul(712,817)/<why()[:>/&mul(482,328)when()'mul(957,978)-}{[>{@what()who()mul(48,186)?]how()$what()&,)mul(33,872)#mul(125,207):;mul(143,386)how(),select()don't()}#when()%]&^@?^mul(107,59)&%?don't()mul(183,332):{}/[(#%-+mul(766,627)from()who() what()-+$^mul(41,791)who()] ;-#select()~mul(939,288)[:(</{$how()%select()mul(624,973) ]%mul(780,706)why(677,630);don't()+mul(3,844)$)$$where(),!why()[:mul(506,60)( <>@what()who()?mul(210,210)?select()why()select()where()-how()^mul(755,497)+?^(mul(860,478)^}+$from()(mul(565,649)}mul(184,450) ;/+%[why()mul(752,488)$how()mul(349,56)#'%,+mul(571,637)(mul(186,674)?how() </~@:%mul(295,276)'~where()-&%!mul(72,565);mul(140,645)%#-#*mul(258,568)!/select()why():&}from()from()don't()mul(458,777)#>,'^#!mul(577,819)mul(767,490)how()@when(359,565)mul(97,67)when()?where()>,'(-mul(267,998)%where()why()where():mul(593,317)<mul(514,327)how()~$[{mul(942,232)how()(who() 'from())mul(752,235)?/!'/*#mul(291,995){who()%!,%mul(873,542)%mul(543,144)from())'select()mul(317,658)+mul(819,545)<&what()who()$#who()how()$*mul(849,792)<;-mul(401,327)select()^}?mul(184,612))(where()what()[where()where()@}'mul(532,791)how()how()from()$*~:mul(963,569)when()%- :}why()^~$mul(520,245))^):{do()!mul(900,510)$ %who(615,822)mul(374,872)''/ mul(808,426)select()mul(268,752)&why(),</%!:!/don't()who(){when()*(where()mul(403,172)^mul(185,447)}mul(233,330)why()/&&%who()#/^mul(705,506)?%from();mul(494,15)['}]-}mul(45,474)who()@who()@why()don't()mul(174,355)?what(),@*$+#&mul(9,768);:^mul(381,691)when()&$/]?what(564,603)^how()mul(468,953)[@when()}mul(702,659) where()?where(){**mul(535,116)~where()$('}^~from()mul(926,18)&who()$when()where()>from(),mul(541,30)/why()${[from()who()  mul(732,465)[<!{mul(794,385)mul(676,776)who()]/mul(45,904)<~+who()@-!)&where()mul(49,63))mul(710,576)+mul(279,872)&<{what()-how(),&how()~\n";

        getRegexForAllMulXY(input);
        getRegexForDoMulXY(input);
    }

    //day 1, challenge 1
    private static void getRegexForAllMulXY(String input) {
        String regex = "mul\\((\\d{1,3}),(\\d{1,3})\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int result = 0;
        while(matcher.find()) {
            int a = Integer.parseInt(matcher.group(1));
            int b = Integer.parseInt(matcher.group(2));
            result += a * b;
        }
        System.out.println("day 1, challenge 1 result: " + result );
    }

    //day 1, challenge 2
    private static void getRegexForDoMulXY(String input) {
        String regex = "mul\\((\\d{1,3}),(\\d{1,3})\\)|do\\(\\)|don't\\(\\)";
        String mulPattern = "mul\\((\\d{1,3}),(\\d{1,3})\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean validSection = true;
        int result = 0;
        while(matcher.find()) {
            String match = matcher.group();

            if (match.contains("do()")) {
                validSection = true;
            } else if (match.contains("don't()")) {
                validSection = false;
            }

            if (validSection && Pattern.matches(mulPattern, match)) {
                int a = Integer.parseInt(matcher.group(1));
                int b = Integer.parseInt(matcher.group(2));
                result += a * b;
            }
        }
        System.out.println("day 1, challenge 2 result: " + result );
    }

}
