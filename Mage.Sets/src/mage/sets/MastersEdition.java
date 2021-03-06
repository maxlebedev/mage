/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.b.BasalThrull;
import mage.cards.d.DwarvenSoldier;
import mage.cards.g.GoblinChirurgeon;
import mage.cards.g.GoblinGrenade;
import mage.cards.h.HighTide;
import mage.cards.h.HymnToTourach;
import mage.cards.m.MindstabThrull;
import mage.cards.o.OrderOfLeitbur;
import mage.cards.o.OrderOfTheEbonHand;
import mage.cards.o.Oubliette;
import mage.cards.p.PhyrexianWarBeast;
import mage.cards.t.ThornThallid;
import mage.constants.SetType;
import mage.constants.Rarity;
import mage.cards.CardGraphicInfo;

/**
 *
 * @author LevelX2
 */
public class MastersEdition extends ExpansionSet {

    private static final MastersEdition instance = new MastersEdition();

    public static MastersEdition getInstance() {
        return instance;
    }

    private MastersEdition() {
        super("Masters Edition", "MED", ExpansionSet.buildDate(2007, 9, 10), SetType.MAGIC_ONLINE);
        this.hasBasicLands = true;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Adun Oakenshield", 141, Rarity.RARE, mage.cards.a.AdunOakenshield.class));
        cards.add(new SetCardInfo("Amnesia", 29, Rarity.RARE, mage.cards.a.Amnesia.class));
        cards.add(new SetCardInfo("Angry Mob", 1, Rarity.UNCOMMON, mage.cards.a.AngryMob.class));
        cards.add(new SetCardInfo("Animate Dead", 57, Rarity.UNCOMMON, mage.cards.a.AnimateDead.class));
        cards.add(new SetCardInfo("Animate Wall", 2, Rarity.UNCOMMON, mage.cards.a.AnimateWall.class));
        cards.add(new SetCardInfo("Ankh of Mishra", 151, Rarity.RARE, mage.cards.a.AnkhOfMishra.class));
        cards.add(new SetCardInfo("Apprentice Wizard", 30, Rarity.COMMON, mage.cards.a.ApprenticeWizard.class));
        cards.add(new SetCardInfo("Arcane Denial", 31, Rarity.COMMON, mage.cards.a.ArcaneDenial.class));
        cards.add(new SetCardInfo("Argivian Archaeologist", 3, Rarity.RARE, mage.cards.a.ArgivianArchaeologist.class));
        cards.add(new SetCardInfo("Armageddon", 4, Rarity.RARE, mage.cards.a.Armageddon.class));
        cards.add(new SetCardInfo("Artifact Blast", 85, Rarity.COMMON, mage.cards.a.ArtifactBlast.class));
        cards.add(new SetCardInfo("Ashnod's Transmogrant", 152, Rarity.COMMON, mage.cards.a.AshnodsTransmogrant.class));
        cards.add(new SetCardInfo("Balduvian Horde", 86, Rarity.RARE, mage.cards.b.BalduvianHorde.class));
        cards.add(new SetCardInfo("Ball Lightning", 87, Rarity.RARE, mage.cards.b.BallLightning.class));
        cards.add(new SetCardInfo("Baron Sengir", 58, Rarity.RARE, mage.cards.b.BaronSengir.class));
        cards.add(new SetCardInfo("Basal Thrull", 59, Rarity.COMMON, BasalThrull.class));
        cards.add(new SetCardInfo("Berserk", 114, Rarity.RARE, mage.cards.b.Berserk.class));
        cards.add(new SetCardInfo("Black Knight", 60, Rarity.UNCOMMON, mage.cards.b.BlackKnight.class));
        cards.add(new SetCardInfo("Blight", 61, Rarity.UNCOMMON, mage.cards.b.Blight.class));
        cards.add(new SetCardInfo("Breeding Pit", 62, Rarity.UNCOMMON, mage.cards.b.BreedingPit.class));
        cards.add(new SetCardInfo("Brothers of Fire", 89, Rarity.COMMON, mage.cards.b.BrothersOfFire.class));
        cards.add(new SetCardInfo("Carnivorous Plant", 115, Rarity.UNCOMMON, mage.cards.c.CarnivorousPlant.class));
        cards.add(new SetCardInfo("Centaur Archer", 142, Rarity.UNCOMMON, mage.cards.c.CentaurArcher.class));
        cards.add(new SetCardInfo("Chains of Mephistopheles", 63, Rarity.RARE, mage.cards.c.ChainsOfMephistopheles.class));
        cards.add(new SetCardInfo("Chub Toad", 116, Rarity.COMMON, mage.cards.c.ChubToad.class));
        cards.add(new SetCardInfo("Clockwork Beast", 153, Rarity.UNCOMMON, mage.cards.c.ClockworkBeast.class));
        cards.add(new SetCardInfo("Contagion", 64, Rarity.RARE, mage.cards.c.Contagion.class));
        cards.add(new SetCardInfo("Copper Tablet", 154, Rarity.UNCOMMON, mage.cards.c.CopperTablet.class));
        cards.add(new SetCardInfo("Crookshank Kobolds", 90, Rarity.COMMON, mage.cards.c.CrookshankKobolds.class));
        cards.add(new SetCardInfo("Crusade", 6, Rarity.RARE, mage.cards.c.Crusade.class));
        cards.add(new SetCardInfo("Cuombajj Witches", 65, Rarity.COMMON, mage.cards.c.CuombajjWitches.class));
        cards.add(new SetCardInfo("Cursed Rack", 155, Rarity.UNCOMMON, mage.cards.c.CursedRack.class));
        cards.add(new SetCardInfo("Dakkon Blackblade", 143, Rarity.RARE, mage.cards.d.DakkonBlackblade.class));
        cards.add(new SetCardInfo("Death Speakers", 7, Rarity.COMMON, mage.cards.d.DeathSpeakers.class));
        cards.add(new SetCardInfo("Death Ward", 8, Rarity.COMMON, mage.cards.d.DeathWard.class));
        cards.add(new SetCardInfo("Derelor", 66, Rarity.UNCOMMON, mage.cards.d.Derelor.class));
        cards.add(new SetCardInfo("Diamond Valley", 175, Rarity.RARE, mage.cards.d.DiamondValley.class));
        cards.add(new SetCardInfo("Diminishing Returns", 32, Rarity.RARE, mage.cards.d.DiminishingReturns.class));
        cards.add(new SetCardInfo("Divine Transformation", 9, Rarity.UNCOMMON, mage.cards.d.DivineTransformation.class));
        cards.add(new SetCardInfo("Dragon Engine", 156, Rarity.COMMON, mage.cards.d.DragonEngine.class));
        cards.add(new SetCardInfo("Dust to Dust", 10, Rarity.COMMON, mage.cards.d.DustToDust.class));
        cards.add(new SetCardInfo("Dwarven Catapult", 91, Rarity.UNCOMMON, mage.cards.d.DwarvenCatapult.class));
        cards.add(new SetCardInfo("Dwarven Soldier", 92, Rarity.COMMON, DwarvenSoldier.class));
        cards.add(new SetCardInfo("Eater of the Dead", 67, Rarity.UNCOMMON, mage.cards.e.EaterOfTheDead.class));
        cards.add(new SetCardInfo("Erg Raiders", 68, Rarity.COMMON, mage.cards.e.ErgRaiders.class));
        cards.add(new SetCardInfo("Eureka", 117, Rarity.RARE, mage.cards.e.Eureka.class));
        cards.add(new SetCardInfo("Exile", 12, Rarity.COMMON, mage.cards.e.Exile.class));
        cards.add(new SetCardInfo("Feast or Famine", 70, Rarity.COMMON, mage.cards.f.FeastOrFamine.class));
        cards.add(new SetCardInfo("Fire Covenant", 145, Rarity.UNCOMMON, mage.cards.f.FireCovenant.class));
        cards.add(new SetCardInfo("Fissure", 93, Rarity.COMMON, mage.cards.f.Fissure.class));
        cards.add(new SetCardInfo("Forcefield", 157, Rarity.RARE, mage.cards.f.Forcefield.class));
        cards.add(new SetCardInfo("Force of Will", 33, Rarity.RARE, mage.cards.f.ForceOfWill.class));
        cards.add(new SetCardInfo("Forest", 193, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 194, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Forest", 195, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Fyndhorn Elves", 118, Rarity.COMMON, mage.cards.f.FyndhornElves.class));
        cards.add(new SetCardInfo("Ghazban Ogre", 120, Rarity.COMMON, mage.cards.g.GhazbanOgre.class));
        cards.add(new SetCardInfo("Giant Tortoise", 34, Rarity.COMMON, mage.cards.g.GiantTortoise.class));
        cards.add(new SetCardInfo("Goblin Chirurgeon", 94, Rarity.COMMON, GoblinChirurgeon.class));
        cards.add(new SetCardInfo("Goblin Grenade", 95, Rarity.UNCOMMON, GoblinGrenade.class));
        cards.add(new SetCardInfo("Goblin Mutant", 96, Rarity.UNCOMMON, mage.cards.g.GoblinMutant.class));
        cards.add(new SetCardInfo("Goblins of the Flarg", 98, Rarity.COMMON, mage.cards.g.GoblinsOfTheFlarg.class));
        cards.add(new SetCardInfo("Goblin Wizard", 97, Rarity.RARE, mage.cards.g.GoblinWizard.class));
        cards.add(new SetCardInfo("Granite Gargoyle", 99, Rarity.UNCOMMON, mage.cards.g.GraniteGargoyle.class));
        cards.add(new SetCardInfo("Hallowed Ground", 14, Rarity.UNCOMMON, mage.cards.h.HallowedGround.class));
        cards.add(new SetCardInfo("Hand of Justice", 15, Rarity.RARE, mage.cards.h.HandOfJustice.class));
        cards.add(new SetCardInfo("Hecatomb", 71, Rarity.RARE, mage.cards.h.Hecatomb.class));
        cards.add(new SetCardInfo("High Tide", 35, Rarity.UNCOMMON, HighTide.class));
        cards.add(new SetCardInfo("Holy Light", 16, Rarity.COMMON, mage.cards.h.HolyLight.class));
        cards.add(new SetCardInfo("Homarid Spawning Bed", 36, Rarity.UNCOMMON, mage.cards.h.HomaridSpawningBed.class));
        cards.add(new SetCardInfo("Hungry Mist", 121, Rarity.COMMON, mage.cards.h.HungryMist.class));
        cards.add(new SetCardInfo("Hyalopterous Lemure", 72, Rarity.COMMON, mage.cards.h.HyalopterousLemure.class));
        cards.add(new SetCardInfo("Hydroblast", 37, Rarity.COMMON, mage.cards.h.Hydroblast.class));
        cards.add(new SetCardInfo("Hymn of Rebirth", 146, Rarity.UNCOMMON, mage.cards.h.HymnOfRebirth.class));
        cards.add(new SetCardInfo("Hymn to Tourach", 73, Rarity.UNCOMMON, HymnToTourach.class));
        cards.add(new SetCardInfo("Icatian Lieutenant", 17, Rarity.COMMON, mage.cards.i.IcatianLieutenant.class));
        cards.add(new SetCardInfo("Icatian Town", 18, Rarity.UNCOMMON, mage.cards.i.IcatianTown.class));
        cards.add(new SetCardInfo("Ice Storm", 122, Rarity.UNCOMMON, mage.cards.i.IceStorm.class));
        cards.add(new SetCardInfo("Ifh-Biff Efreet", 123, Rarity.RARE, mage.cards.i.IfhBiffEfreet.class));
        cards.add(new SetCardInfo("Illusionary Forces", 38, Rarity.UNCOMMON, mage.cards.i.IllusionaryForces.class));
        cards.add(new SetCardInfo("Illusionary Wall", 39, Rarity.COMMON, mage.cards.i.IllusionaryWall.class));
        cards.add(new SetCardInfo("Illusions of Grandeur", 40, Rarity.RARE, mage.cards.i.IllusionsOfGrandeur.class));
        cards.add(new SetCardInfo("Island", 184, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 185, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island", 186, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Island of Wak-Wak", 176, Rarity.RARE, mage.cards.i.IslandOfWakWak.class));
        cards.add(new SetCardInfo("Ivory Tower", 158, Rarity.RARE, mage.cards.i.IvoryTower.class));
        cards.add(new SetCardInfo("Jacques le Vert", 147, Rarity.RARE, mage.cards.j.JacquesLeVert.class));
        cards.add(new SetCardInfo("Jokulhaups", 100, Rarity.RARE, mage.cards.j.Jokulhaups.class));
        cards.add(new SetCardInfo("Juxtapose", 41, Rarity.UNCOMMON, mage.cards.j.Juxtapose.class));
        cards.add(new SetCardInfo("Juzam Djinn", 74, Rarity.RARE, mage.cards.j.JuzamDjinn.class));
        cards.add(new SetCardInfo("Keldon Warlord", 101, Rarity.UNCOMMON, mage.cards.k.KeldonWarlord.class));
        cards.add(new SetCardInfo("Khabal Ghoul", 75, Rarity.RARE, mage.cards.k.KhabalGhoul.class));
        cards.add(new SetCardInfo("Lake of the Dead", 177, Rarity.RARE, mage.cards.l.LakeOfTheDead.class));
        cards.add(new SetCardInfo("Lightning Bolt", 102, Rarity.COMMON, mage.cards.l.LightningBolt.class));
        cards.add(new SetCardInfo("Lim-Dul's Vault", 148, Rarity.UNCOMMON, mage.cards.l.LimDulsVault.class));
        cards.add(new SetCardInfo("Lord of Tresserhorn", 149, Rarity.RARE, mage.cards.l.LordOfTresserhorn.class));
        cards.add(new SetCardInfo("Mana Flare", 103, Rarity.RARE, mage.cards.m.ManaFlare.class));
        cards.add(new SetCardInfo("Marton Stromgald", 104, Rarity.RARE, mage.cards.m.MartonStromgald.class));
        cards.add(new SetCardInfo("Mindstab Thrull", 76, Rarity.COMMON, MindstabThrull.class));
        cards.add(new SetCardInfo("Mirror Universe", 159, Rarity.RARE, mage.cards.m.MirrorUniverse.class));
        cards.add(new SetCardInfo("Mishra's Factory", 178, Rarity.UNCOMMON, mage.cards.m.MishrasFactory.class));
        cards.add(new SetCardInfo("Moat", 21, Rarity.RARE, mage.cards.m.Moat.class));
        cards.add(new SetCardInfo("Mountain", 190, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 191, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain", 192, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Mountain Yeti", 105, Rarity.COMMON, mage.cards.m.MountainYeti.class));
        cards.add(new SetCardInfo("Mystic Remora", 42, Rarity.UNCOMMON, mage.cards.m.MysticRemora.class));
        cards.add(new SetCardInfo("Nature's Lore", 124, Rarity.COMMON, mage.cards.n.NaturesLore.class));
        cards.add(new SetCardInfo("Nether Shadow", 77, Rarity.UNCOMMON, mage.cards.n.NetherShadow.class));
        cards.add(new SetCardInfo("Nevinyrral's Disk", 160, Rarity.RARE, mage.cards.n.NevinyrralsDisk.class));
        cards.add(new SetCardInfo("Onulet", 161, Rarity.COMMON, mage.cards.o.Onulet.class));
        cards.add(new SetCardInfo("Orcish Mechanics", 106, Rarity.UNCOMMON, mage.cards.o.OrcishMechanics.class));
        cards.add(new SetCardInfo("Order of Leitbur", 22, Rarity.COMMON, OrderOfLeitbur.class));
        cards.add(new SetCardInfo("Order of the Ebon Hand", 78, Rarity.COMMON, OrderOfTheEbonHand.class));
        cards.add(new SetCardInfo("Oubliette", 79, Rarity.COMMON, Oubliette.class));
        cards.add(new SetCardInfo("Paralyze", 80, Rarity.COMMON, mage.cards.p.Paralyze.class));
        cards.add(new SetCardInfo("Phantom Monster", 43, Rarity.COMMON, mage.cards.p.PhantomMonster.class));
        cards.add(new SetCardInfo("Phelddagrif", 150, Rarity.RARE, mage.cards.p.Phelddagrif.class));
        cards.add(new SetCardInfo("Phyrexian War Beast", 162, Rarity.UNCOMMON, PhyrexianWarBeast.class));
        cards.add(new SetCardInfo("Plains", 181, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 182, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Plains", 183, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Polar Kraken", 44, Rarity.RARE, mage.cards.p.PolarKraken.class));
        cards.add(new SetCardInfo("Pox", 82, Rarity.RARE, mage.cards.p.Pox.class));
        cards.add(new SetCardInfo("Preacher", 24, Rarity.RARE, mage.cards.p.Preacher.class));
        cards.add(new SetCardInfo("Primal Order", 125, Rarity.RARE, mage.cards.p.PrimalOrder.class));
        cards.add(new SetCardInfo("Psychic Venom", 46, Rarity.COMMON, mage.cards.p.PsychicVenom.class));
        cards.add(new SetCardInfo("Pyroblast", 107, Rarity.COMMON, mage.cards.p.Pyroblast.class));
        cards.add(new SetCardInfo("Rabid Wombat", 126, Rarity.UNCOMMON, mage.cards.r.RabidWombat.class));
        cards.add(new SetCardInfo("Rainbow Vale", 179, Rarity.RARE, mage.cards.r.RainbowVale.class));
        cards.add(new SetCardInfo("Righteous Avengers", 25, Rarity.COMMON, mage.cards.r.RighteousAvengers.class));
        cards.add(new SetCardInfo("River Merfolk", 47, Rarity.COMMON, mage.cards.r.RiverMerfolk.class));
        cards.add(new SetCardInfo("Roots", 127, Rarity.COMMON, mage.cards.r.Roots.class));
        cards.add(new SetCardInfo("Scryb Sprites", 128, Rarity.COMMON, mage.cards.s.ScrybSprites.class));
        cards.add(new SetCardInfo("Seasinger", 49, Rarity.UNCOMMON, mage.cards.s.Seasinger.class));
        cards.add(new SetCardInfo("Sea Sprite", 48, Rarity.COMMON, mage.cards.s.SeaSprite.class));
        cards.add(new SetCardInfo("Serendib Efreet", 50, Rarity.RARE, mage.cards.s.SerendibEfreet.class));
        cards.add(new SetCardInfo("Serpent Generator", 164, Rarity.RARE, mage.cards.s.SerpentGenerator.class));
        cards.add(new SetCardInfo("Shambling Strider", 129, Rarity.COMMON, mage.cards.s.ShamblingStrider.class));
        cards.add(new SetCardInfo("Shield of the Ages", 165, Rarity.UNCOMMON, mage.cards.s.ShieldOfTheAges.class));
        cards.add(new SetCardInfo("Shield Sphere", 166, Rarity.COMMON, mage.cards.s.ShieldSphere.class));
        cards.add(new SetCardInfo("Singing Tree", 130, Rarity.UNCOMMON, mage.cards.s.SingingTree.class));
        cards.add(new SetCardInfo("Spectral Bears", 131, Rarity.UNCOMMON, mage.cards.s.SpectralBears.class));
        cards.add(new SetCardInfo("Spinal Villain", 108, Rarity.UNCOMMON, mage.cards.s.SpinalVillain.class));
        cards.add(new SetCardInfo("Stone Calendar", 167, Rarity.UNCOMMON, mage.cards.s.StoneCalendar.class));
        cards.add(new SetCardInfo("Stone Giant", 109, Rarity.UNCOMMON, mage.cards.s.StoneGiant.class));
        cards.add(new SetCardInfo("Storm Seeker", 132, Rarity.UNCOMMON, mage.cards.s.StormSeeker.class));
        cards.add(new SetCardInfo("Su-Chi", 168, Rarity.RARE, mage.cards.s.SuChi.class));
        cards.add(new SetCardInfo("Sunken City", 51, Rarity.UNCOMMON, mage.cards.s.SunkenCity.class));
        cards.add(new SetCardInfo("Swamp", 187, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 188, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Swamp", 189, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(null, true)));
        cards.add(new SetCardInfo("Sylvan Library", 133, Rarity.RARE, mage.cards.s.SylvanLibrary.class));
        cards.add(new SetCardInfo("Tawnos's Coffin", 169, Rarity.RARE, mage.cards.t.TawnossCoffin.class));
        cards.add(new SetCardInfo("Thawing Glaciers", 180, Rarity.RARE, mage.cards.t.ThawingGlaciers.class));
        cards.add(new SetCardInfo("Thicket Basilisk", 134, Rarity.UNCOMMON, mage.cards.t.ThicketBasilisk.class));
        cards.add(new SetCardInfo("Thorn Thallid", 135, Rarity.COMMON, ThornThallid.class));
        cards.add(new SetCardInfo("Thrull Champion", 83, Rarity.RARE, mage.cards.t.ThrullChampion.class));
        cards.add(new SetCardInfo("Thrull Retainer", 84, Rarity.COMMON, mage.cards.t.ThrullRetainer.class));
        cards.add(new SetCardInfo("Thunder Spirit", 27, Rarity.UNCOMMON, mage.cards.t.ThunderSpirit.class));
        cards.add(new SetCardInfo("Tivadar's Crusade", 28, Rarity.UNCOMMON, mage.cards.t.TivadarsCrusade.class));
        cards.add(new SetCardInfo("Tornado", 136, Rarity.RARE, mage.cards.t.Tornado.class));
        cards.add(new SetCardInfo("Urza's Bauble", 170, Rarity.UNCOMMON, mage.cards.u.UrzasBauble.class));
        cards.add(new SetCardInfo("Urza's Chalice", 171, Rarity.COMMON, mage.cards.u.UrzasChalice.class));
        cards.add(new SetCardInfo("Vesuvan Doppelganger", 54, Rarity.RARE, mage.cards.v.VesuvanDoppelganger.class));
        cards.add(new SetCardInfo("Vodalian Knights", 55, Rarity.UNCOMMON, mage.cards.v.VodalianKnights.class));
        cards.add(new SetCardInfo("Walking Wall", 172, Rarity.UNCOMMON, mage.cards.w.WalkingWall.class));
        cards.add(new SetCardInfo("Wanderlust", 137, Rarity.COMMON, mage.cards.w.Wanderlust.class));
        cards.add(new SetCardInfo("Winds of Change", 111, Rarity.UNCOMMON, mage.cards.w.WindsOfChange.class));
        cards.add(new SetCardInfo("Winter Orb", 173, Rarity.RARE, mage.cards.w.WinterOrb.class));
        cards.add(new SetCardInfo("Wyluli Wolf", 139, Rarity.COMMON, mage.cards.w.WyluliWolf.class));
        cards.add(new SetCardInfo("Yavimaya Ants", 140, Rarity.UNCOMMON, mage.cards.y.YavimayaAnts.class));
        cards.add(new SetCardInfo("Ydwen Efreet", 112, Rarity.RARE, mage.cards.y.YdwenEfreet.class));
        cards.add(new SetCardInfo("Zuran Orb", 174, Rarity.UNCOMMON, mage.cards.z.ZuranOrb.class));
    }

}
