/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;

/**
 *
 * @author North
 */
public class SaviorsOfKamigawa extends ExpansionSet {

    private static final SaviorsOfKamigawa instance = new SaviorsOfKamigawa();

    public static SaviorsOfKamigawa getInstance() {
        return instance;
    }

    private SaviorsOfKamigawa() {
        super("Saviors of Kamigawa", "SOK", ExpansionSet.buildDate(2005, 5, 3), SetType.EXPANSION);
        this.blockName = "Kamigawa";
        this.parentSet = ChampionsOfKamigawa.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Adamaro, First to Desire", 91, Rarity.RARE, mage.cards.a.AdamaroFirstToDesire.class));
        cards.add(new SetCardInfo("Aether Shockwave", 1, Rarity.UNCOMMON, mage.cards.a.AetherShockwave.class));
        cards.add(new SetCardInfo("Akki Drillmaster", 92, Rarity.COMMON, mage.cards.a.AkkiDrillmaster.class));
        cards.add(new SetCardInfo("Akki Underling", 93, Rarity.COMMON, mage.cards.a.AkkiUnderling.class));
        cards.add(new SetCardInfo("Akuta, Born of Ash", 61, Rarity.RARE, mage.cards.a.AkutaBornOfAsh.class));
        cards.add(new SetCardInfo("Araba Mothrider", 2, Rarity.COMMON, mage.cards.a.ArabaMothrider.class));
        cards.add(new SetCardInfo("Arashi, the Sky Asunder", 121, Rarity.RARE, mage.cards.a.ArashiTheSkyAsunder.class));
        cards.add(new SetCardInfo("Ashes of the Fallen", 152, Rarity.RARE, mage.cards.a.AshesOfTheFallen.class));
        cards.add(new SetCardInfo("Ayumi, the Last Visitor", 122, Rarity.RARE, mage.cards.a.AyumiTheLastVisitor.class));
        cards.add(new SetCardInfo("Barrel Down Sokenzan", 94, Rarity.COMMON, mage.cards.b.BarrelDownSokenzan.class));
        cards.add(new SetCardInfo("Blood Clock", 153, Rarity.RARE, mage.cards.b.BloodClock.class));
        cards.add(new SetCardInfo("Bounteous Kirin", 123, Rarity.RARE, mage.cards.b.BounteousKirin.class));
        cards.add(new SetCardInfo("Briarknit Kami", 124, Rarity.UNCOMMON, mage.cards.b.BriarknitKami.class));
        cards.add(new SetCardInfo("Burning-Eye Zubera", 95, Rarity.UNCOMMON, mage.cards.b.BurningEyeZubera.class));
        cards.add(new SetCardInfo("Captive Flame", 96, Rarity.UNCOMMON, mage.cards.c.CaptiveFlame.class));
        cards.add(new SetCardInfo("Celestial Kirin", 3, Rarity.RARE, mage.cards.c.CelestialKirin.class));
        cards.add(new SetCardInfo("Charge Across the Araba", 4, Rarity.UNCOMMON, mage.cards.c.ChargeAcrossTheAraba.class));
        cards.add(new SetCardInfo("Choice of Damnations", 62, Rarity.RARE, mage.cards.c.ChoiceOfDamnations.class));
        cards.add(new SetCardInfo("Cloudhoof Kirin", 31, Rarity.RARE, mage.cards.c.CloudhoofKirin.class));
        cards.add(new SetCardInfo("Cowed by Wisdom", 5, Rarity.COMMON, mage.cards.c.CowedByWisdom.class));
        cards.add(new SetCardInfo("Curtain of Light", 6, Rarity.COMMON, mage.cards.c.CurtainOfLight.class));
        cards.add(new SetCardInfo("Cut the Earthly Bond", 32, Rarity.COMMON, mage.cards.c.CutTheEarthlyBond.class));
        cards.add(new SetCardInfo("Death Denied", 63, Rarity.COMMON, mage.cards.d.DeathDenied.class));
        cards.add(new SetCardInfo("Deathknell Kami", 65, Rarity.COMMON, mage.cards.d.DeathknellKami.class));
        cards.add(new SetCardInfo("Deathmask Nezumi", 66, Rarity.COMMON, mage.cards.d.DeathmaskNezumi.class));
        cards.add(new SetCardInfo("Death of a Thousand Stings", 64, Rarity.COMMON, mage.cards.d.DeathOfAThousandStings.class));
        cards.add(new SetCardInfo("Dense Canopy", 125, Rarity.UNCOMMON, mage.cards.d.DenseCanopy.class));
        cards.add(new SetCardInfo("Descendant of Kiyomaro", 7, Rarity.UNCOMMON, mage.cards.d.DescendantOfKiyomaro.class));
        cards.add(new SetCardInfo("Descendant of Masumaro", 126, Rarity.UNCOMMON, mage.cards.d.DescendantOfMasumaro.class));
        cards.add(new SetCardInfo("Descendant of Soramaro", 33, Rarity.COMMON, mage.cards.d.DescendantOfSoramaro.class));
        cards.add(new SetCardInfo("Dosan's Oldest Chant", 127, Rarity.COMMON, mage.cards.d.DosansOldestChant.class));
        cards.add(new SetCardInfo("Dreamcatcher", 34, Rarity.COMMON, mage.cards.d.Dreamcatcher.class));
        cards.add(new SetCardInfo("Ebony Owl Netsuke", 154, Rarity.UNCOMMON, mage.cards.e.EbonyOwlNetsuke.class));
        cards.add(new SetCardInfo("Eiganjo Free-Riders", 8, Rarity.UNCOMMON, mage.cards.e.EiganjoFreeRiders.class));
        cards.add(new SetCardInfo("Elder Pine of Jukai", 128, Rarity.COMMON, mage.cards.e.ElderPineOfJukai.class));
        cards.add(new SetCardInfo("Endless Swarm", 129, Rarity.RARE, mage.cards.e.EndlessSwarm.class));
        cards.add(new SetCardInfo("Enduring Ideal", 9, Rarity.RARE, mage.cards.e.EnduringIdeal.class));
        cards.add(new SetCardInfo("Erayo, Soratami Ascendant", 35, Rarity.RARE, mage.cards.e.ErayoSoratamiAscendant.class));
        cards.add(new SetCardInfo("Eternal Dominion", 36, Rarity.RARE, mage.cards.e.EternalDominion.class));
        cards.add(new SetCardInfo("Evermind", 37, Rarity.UNCOMMON, mage.cards.e.Evermind.class));
        cards.add(new SetCardInfo("Exile into Darkness", 67, Rarity.UNCOMMON, mage.cards.e.ExileIntoDarkness.class));
        cards.add(new SetCardInfo("Feral Lightning", 97, Rarity.UNCOMMON, mage.cards.f.FeralLightning.class));
        cards.add(new SetCardInfo("Fiddlehead Kami", 130, Rarity.COMMON, mage.cards.f.FiddleheadKami.class));
        cards.add(new SetCardInfo("Footsteps of the Goryo", 68, Rarity.UNCOMMON, mage.cards.f.FootstepsOfTheGoryo.class));
        cards.add(new SetCardInfo("Freed from the Real", 38, Rarity.COMMON, mage.cards.f.FreedFromTheReal.class));
        cards.add(new SetCardInfo("Gaze of Adamaro", 98, Rarity.UNCOMMON, mage.cards.g.GazeOfAdamaro.class));
        cards.add(new SetCardInfo("Ghost-Lit Nourisher", 131, Rarity.UNCOMMON, mage.cards.g.GhostLitNourisher.class));
        cards.add(new SetCardInfo("Ghost-Lit Raider", 99, Rarity.UNCOMMON, mage.cards.g.GhostLitRaider.class));
        cards.add(new SetCardInfo("Ghost-Lit Redeemer", 10, Rarity.UNCOMMON, mage.cards.g.GhostLitRedeemer.class));
        cards.add(new SetCardInfo("Ghost-Lit Stalker", 69, Rarity.UNCOMMON, mage.cards.g.GhostLitStalker.class));
        cards.add(new SetCardInfo("Ghost-Lit Warder", 39, Rarity.UNCOMMON, mage.cards.g.GhostLitWarder.class));
        cards.add(new SetCardInfo("Glitterfang", 100, Rarity.COMMON, mage.cards.g.Glitterfang.class));
        cards.add(new SetCardInfo("Gnat Miser", 70, Rarity.COMMON, mage.cards.g.GnatMiser.class));
        cards.add(new SetCardInfo("Godo's Irregulars", 101, Rarity.UNCOMMON, mage.cards.g.GodosIrregulars.class));
        cards.add(new SetCardInfo("Hail of Arrows", 11, Rarity.UNCOMMON, mage.cards.h.HailOfArrows.class));
        cards.add(new SetCardInfo("Hand of Cruelty", 71, Rarity.UNCOMMON, mage.cards.h.HandOfCruelty.class));
        cards.add(new SetCardInfo("Hand of Honor", 12, Rarity.UNCOMMON, mage.cards.h.HandOfHonor.class));
        cards.add(new SetCardInfo("Haru-Onna", 132, Rarity.UNCOMMON, mage.cards.h.HaruOnna.class));
        cards.add(new SetCardInfo("Hidetsugu's Second Rite", 102, Rarity.RARE, mage.cards.h.HidetsugusSecondRite.class));
        cards.add(new SetCardInfo("Homura, Human Ascendant", 103, Rarity.RARE, mage.cards.h.HomuraHumanAscendant.class));
        cards.add(new SetCardInfo("Ideas Unbound", 40, Rarity.COMMON, mage.cards.i.IdeasUnbound.class));
        cards.add(new SetCardInfo("Iizuka the Ruthless", 104, Rarity.RARE, mage.cards.i.IizukaTheRuthless.class));
        cards.add(new SetCardInfo("Iname as One", 151, Rarity.RARE, mage.cards.i.InameAsOne.class));
        cards.add(new SetCardInfo("Infernal Kirin", 72, Rarity.RARE, mage.cards.i.InfernalKirin.class));
        cards.add(new SetCardInfo("Inner Calm, Outer Strength", 133, Rarity.COMMON, mage.cards.i.InnerCalmOuterStrength.class));
        cards.add(new SetCardInfo("Inner-Chamber Guard", 13, Rarity.UNCOMMON, mage.cards.i.InnerChamberGuard.class));
        cards.add(new SetCardInfo("Inner Fire", 105, Rarity.COMMON, mage.cards.i.InnerFire.class));
        cards.add(new SetCardInfo("Into the Fray", 106, Rarity.COMMON, mage.cards.i.IntoTheFray.class));
        cards.add(new SetCardInfo("Ivory Crane Netsuke", 155, Rarity.UNCOMMON, mage.cards.i.IvoryCraneNetsuke.class));
        cards.add(new SetCardInfo("Jiwari, the Earth Aflame", 107, Rarity.RARE, mage.cards.j.JiwariTheEarthAflame.class));
        cards.add(new SetCardInfo("Kagemaro, First to Suffer", 73, Rarity.RARE, mage.cards.k.KagemaroFirstToSuffer.class));
        cards.add(new SetCardInfo("Kagemaro's Clutch", 74, Rarity.COMMON, mage.cards.k.KagemarosClutch.class));
        cards.add(new SetCardInfo("Kaho, Minamo Historian", 41, Rarity.RARE, mage.cards.k.KahoMinamoHistorian.class));
        cards.add(new SetCardInfo("Kami of Empty Graves", 75, Rarity.COMMON, mage.cards.k.KamiOfEmptyGraves.class));
        cards.add(new SetCardInfo("Kami of the Crescent Moon", 42, Rarity.RARE, mage.cards.k.KamiOfTheCrescentMoon.class));
        cards.add(new SetCardInfo("Kami of the Tended Garden", 134, Rarity.UNCOMMON, mage.cards.k.KamiOfTheTendedGarden.class));
        cards.add(new SetCardInfo("Kashi-Tribe Elite", 135, Rarity.UNCOMMON, mage.cards.k.KashiTribeElite.class));
        cards.add(new SetCardInfo("Kataki, War's Wage", 14, Rarity.RARE, mage.cards.k.KatakiWarsWage.class));
        cards.add(new SetCardInfo("Kemuri-Onna", 76, Rarity.UNCOMMON, mage.cards.k.KemuriOnna.class));
        cards.add(new SetCardInfo("Kiku's Shadow", 77, Rarity.UNCOMMON, mage.cards.k.KikusShadow.class));
        cards.add(new SetCardInfo("Kiri-Onna", 43, Rarity.UNCOMMON, mage.cards.k.KiriOnna.class));
        cards.add(new SetCardInfo("Kitsune Bonesetter", 15, Rarity.COMMON, mage.cards.k.KitsuneBonesetter.class));
        cards.add(new SetCardInfo("Kitsune Dawnblade", 16, Rarity.COMMON, mage.cards.k.KitsuneDawnblade.class));
        cards.add(new SetCardInfo("Kitsune Loreweaver", 17, Rarity.COMMON, mage.cards.k.KitsuneLoreweaver.class));
        cards.add(new SetCardInfo("Kiyomaro, First to Stand", 18, Rarity.RARE, mage.cards.k.KiyomaroFirstToStand.class));
        cards.add(new SetCardInfo("Kuon, Ogre Ascendant", 78, Rarity.RARE, mage.cards.k.KuonOgreAscendant.class));
        cards.add(new SetCardInfo("Kuro's Taken", 79, Rarity.COMMON, mage.cards.k.KurosTaken.class));
        cards.add(new SetCardInfo("Locust Miser", 80, Rarity.UNCOMMON, mage.cards.l.LocustMiser.class));
        cards.add(new SetCardInfo("Maga, Traitor to Mortals", 81, Rarity.RARE, mage.cards.m.MagaTraitorToMortals.class));
        cards.add(new SetCardInfo("Manriki-Gusari", 156, Rarity.UNCOMMON, mage.cards.m.ManrikiGusari.class));
        cards.add(new SetCardInfo("Masumaro, First to Live", 136, Rarity.RARE, mage.cards.m.MasumaroFirstToLive.class));
        cards.add(new SetCardInfo("Matsu-Tribe Birdstalker", 137, Rarity.COMMON, mage.cards.m.MatsuTribeBirdstalker.class));
        cards.add(new SetCardInfo("Measure of Wickedness", 82, Rarity.UNCOMMON, mage.cards.m.MeasureOfWickedness.class));
        cards.add(new SetCardInfo("Meishin, the Mind Cage", 44, Rarity.RARE, mage.cards.m.MeishinTheMindCage.class));
        cards.add(new SetCardInfo("Michiko Konda, Truth Seeker", 19, Rarity.RARE, mage.cards.m.MichikoKondaTruthSeeker.class));
        cards.add(new SetCardInfo("Mikokoro, Center of the Sea", 162, Rarity.RARE, mage.cards.m.MikokoroCenterOfTheSea.class));
        cards.add(new SetCardInfo("Minamo Scrollkeeper", 45, Rarity.COMMON, mage.cards.m.MinamoScrollkeeper.class));
        cards.add(new SetCardInfo("Miren, the Moaning Well", 163, Rarity.RARE, mage.cards.m.MirenTheMoaningWell.class));
        cards.add(new SetCardInfo("Molting Skin", 138, Rarity.UNCOMMON, mage.cards.m.MoltingSkin.class));
        cards.add(new SetCardInfo("Moonbow Illusionist", 46, Rarity.COMMON, mage.cards.m.MoonbowIllusionist.class));
        cards.add(new SetCardInfo("Moonwing Moth", 20, Rarity.COMMON, mage.cards.m.MoonwingMoth.class));
        cards.add(new SetCardInfo("Murmurs from Beyond", 47, Rarity.COMMON, mage.cards.m.MurmursFromBeyond.class));
        cards.add(new SetCardInfo("Neverending Torment", 83, Rarity.RARE, mage.cards.n.NeverendingTorment.class));
        cards.add(new SetCardInfo("Nightsoil Kami", 139, Rarity.COMMON, mage.cards.n.NightsoilKami.class));
        cards.add(new SetCardInfo("Nikko-Onna", 21, Rarity.UNCOMMON, mage.cards.n.NikkoOnna.class));
        cards.add(new SetCardInfo("Oboro Breezecaller", 48, Rarity.COMMON, mage.cards.o.OboroBreezecaller.class));
        cards.add(new SetCardInfo("Oboro Envoy", 49, Rarity.UNCOMMON, mage.cards.o.OboroEnvoy.class));
        cards.add(new SetCardInfo("Oboro, Palace in the Clouds", 164, Rarity.RARE, mage.cards.o.OboroPalaceInTheClouds.class));
        cards.add(new SetCardInfo("Okina Nightwatch", 140, Rarity.COMMON, mage.cards.o.OkinaNightwatch.class));
        cards.add(new SetCardInfo("O-Naginata", 157, Rarity.UNCOMMON, mage.cards.o.ONaginata.class));
        cards.add(new SetCardInfo("One with Nothing", 84, Rarity.RARE, mage.cards.o.OneWithNothing.class));
        cards.add(new SetCardInfo("Oni of Wild Places", 108, Rarity.UNCOMMON, mage.cards.o.OniOfWildPlaces.class));
        cards.add(new SetCardInfo("Oppressive Will", 50, Rarity.COMMON, mage.cards.o.OppressiveWill.class));
        cards.add(new SetCardInfo("Overwhelming Intellect", 51, Rarity.UNCOMMON, mage.cards.o.OverwhelmingIntellect.class));
        cards.add(new SetCardInfo("Pain's Reward", 85, Rarity.RARE, mage.cards.p.PainsReward.class));
        cards.add(new SetCardInfo("Path of Anger's Flame", 109, Rarity.COMMON, mage.cards.p.PathOfAngersFlame.class));
        cards.add(new SetCardInfo("Pithing Needle", 158, Rarity.RARE, mage.cards.p.PithingNeedle.class));
        cards.add(new SetCardInfo("Plow Through Reito", 22, Rarity.COMMON, mage.cards.p.PlowThroughReito.class));
        cards.add(new SetCardInfo("Presence of the Wise", 23, Rarity.UNCOMMON, mage.cards.p.PresenceOfTheWise.class));
        cards.add(new SetCardInfo("Promised Kannushi", 141, Rarity.COMMON, mage.cards.p.PromisedKannushi.class));
        cards.add(new SetCardInfo("Promise of Bunrei", 24, Rarity.RARE, mage.cards.p.PromiseOfBunrei.class));
        cards.add(new SetCardInfo("Pure Intentions", 25, Rarity.RARE, mage.cards.p.PureIntentions.class));
        cards.add(new SetCardInfo("Rally the Horde", 110, Rarity.RARE, mage.cards.r.RallyTheHorde.class));
        cards.add(new SetCardInfo("Raving Oni-Slave", 86, Rarity.COMMON, mage.cards.r.RavingOniSlave.class));
        cards.add(new SetCardInfo("Razorjaw Oni", 87, Rarity.UNCOMMON, mage.cards.r.RazorjawOni.class));
        cards.add(new SetCardInfo("Reki, the History of Kamigawa", 142, Rarity.RARE, mage.cards.r.RekiTheHistoryOfKamigawa.class));
        cards.add(new SetCardInfo("Rending Vines", 143, Rarity.COMMON, mage.cards.r.RendingVines.class));
        cards.add(new SetCardInfo("Reverence", 26, Rarity.RARE, mage.cards.r.Reverence.class));
        cards.add(new SetCardInfo("Ronin Cavekeeper", 111, Rarity.COMMON, mage.cards.r.RoninCavekeeper.class));
        cards.add(new SetCardInfo("Rune-Tail, Kitsune Ascendant", 27, Rarity.RARE, mage.cards.r.RuneTailKitsuneAscendant.class));
        cards.add(new SetCardInfo("Rushing-Tide Zubera", 52, Rarity.UNCOMMON, mage.cards.r.RushingTideZubera.class));
        cards.add(new SetCardInfo("Sakashima the Impostor", 53, Rarity.RARE, mage.cards.s.SakashimaTheImpostor.class));
        cards.add(new SetCardInfo("Sakura-Tribe Scout", 144, Rarity.COMMON, mage.cards.s.SakuraTribeScout.class));
        cards.add(new SetCardInfo("Sasaya, Orochi Ascendant", 145, Rarity.RARE, mage.cards.s.SasayaOrochiAscendant.class));
        cards.add(new SetCardInfo("Scroll of Origins", 159, Rarity.RARE, mage.cards.s.ScrollOfOrigins.class));
        cards.add(new SetCardInfo("Secretkeeper", 54, Rarity.UNCOMMON, mage.cards.s.Secretkeeper.class));
        cards.add(new SetCardInfo("Seed the Land", 146, Rarity.RARE, mage.cards.s.SeedTheLand.class));
        cards.add(new SetCardInfo("Seek the Horizon", 147, Rarity.UNCOMMON, mage.cards.s.SeekTheHorizon.class));
        cards.add(new SetCardInfo("Sekki, Seasons' Guide", 148, Rarity.RARE, mage.cards.s.SekkiSeasonsGuide.class));
        cards.add(new SetCardInfo("Shape Stealer", 55, Rarity.UNCOMMON, mage.cards.s.ShapeStealer.class));
        cards.add(new SetCardInfo("Shifting Borders", 56, Rarity.UNCOMMON, mage.cards.s.ShiftingBorders.class));
        cards.add(new SetCardInfo("Shinen of Fear's Chill", 88, Rarity.COMMON, mage.cards.s.ShinenOfFearsChill.class));
        cards.add(new SetCardInfo("Shinen of Flight's Wings", 57, Rarity.COMMON, mage.cards.s.ShinenOfFlightsWings.class));
        cards.add(new SetCardInfo("Shinen of Fury's Fire", 112, Rarity.COMMON, mage.cards.s.ShinenOfFurysFire.class));
        cards.add(new SetCardInfo("Shinen of Life's Roar", 149, Rarity.COMMON, mage.cards.s.ShinenOfLifesRoar.class));
        cards.add(new SetCardInfo("Shinen of Stars' Light", 28, Rarity.COMMON, mage.cards.s.ShinenOfStarsLight.class));
        cards.add(new SetCardInfo("Sink into Takenuma", 89, Rarity.COMMON, mage.cards.s.SinkIntoTakenuma.class));
        cards.add(new SetCardInfo("Skull Collector", 90, Rarity.UNCOMMON, mage.cards.s.SkullCollector.class));
        cards.add(new SetCardInfo("Skyfire Kirin", 113, Rarity.RARE, mage.cards.s.SkyfireKirin.class));
        cards.add(new SetCardInfo("Sokenzan Renegade", 114, Rarity.UNCOMMON, mage.cards.s.SokenzanRenegade.class));
        cards.add(new SetCardInfo("Sokenzan Spellblade", 115, Rarity.COMMON, mage.cards.s.SokenzanSpellblade.class));
        cards.add(new SetCardInfo("Soramaro, First to Dream", 58, Rarity.RARE, mage.cards.s.SoramaroFirstToDream.class));
        cards.add(new SetCardInfo("Soratami Cloud Chariot", 160, Rarity.UNCOMMON, mage.cards.s.SoratamiCloudChariot.class));
        cards.add(new SetCardInfo("Spiraling Embers", 116, Rarity.COMMON, mage.cards.s.SpiralingEmbers.class));
        cards.add(new SetCardInfo("Spiritual Visit", 29, Rarity.COMMON, mage.cards.s.SpiritualVisit.class));
        cards.add(new SetCardInfo("Stampeding Serow", 150, Rarity.UNCOMMON, mage.cards.s.StampedingSerow.class));
        cards.add(new SetCardInfo("Sunder from Within", 117, Rarity.UNCOMMON, mage.cards.s.SunderFromWithin.class));
        cards.add(new SetCardInfo("Thoughts of Ruin", 118, Rarity.RARE, mage.cards.t.ThoughtsOfRuin.class));
        cards.add(new SetCardInfo("Tomb of Urami", 165, Rarity.RARE, mage.cards.t.TombOfUrami.class));
        cards.add(new SetCardInfo("Torii Watchward", 30, Rarity.COMMON, mage.cards.t.ToriiWatchward.class));
        cards.add(new SetCardInfo("Trusted Advisor", 59, Rarity.UNCOMMON, mage.cards.t.TrustedAdvisor.class));
        cards.add(new SetCardInfo("Twincast", 60, Rarity.RARE, mage.cards.t.Twincast.class));
        cards.add(new SetCardInfo("Undying Flames", 119, Rarity.RARE, mage.cards.u.UndyingFlames.class));
        cards.add(new SetCardInfo("Wine of Blood and Iron", 161, Rarity.RARE, mage.cards.w.WineOfBloodAndIron.class));
        cards.add(new SetCardInfo("Yuki-Onna", 120, Rarity.UNCOMMON, mage.cards.y.YukiOnna.class));
    }
}
