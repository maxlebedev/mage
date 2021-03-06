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
package mage.cards.c;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksAndIsNotBlockedTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.Cards;
import mage.cards.CardsImpl;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.players.Player;

/**
 *
 * @author LoneFox
 */
public class CoralFighters extends CardImpl {

    public CoralFighters(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{1}{U}");
        this.subtype.add("Merfolk");
        this.subtype.add("Soldier");
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // Whenever Coral Fighters attacks and isn't blocked, look at the top card of defending player's library. You may put that card on the bottom of that player's library.
        this.addAbility(new AttacksAndIsNotBlockedTriggeredAbility(new CoralFightersEffect(), false, true));
    }

    public CoralFighters(final CoralFighters card) {
        super(card);
    }

    @Override
    public CoralFighters copy() {
        return new CoralFighters(this);
    }
}

class CoralFightersEffect extends OneShotEffect {

    public CoralFightersEffect() {
        super(Outcome.Detriment);
        staticText = "look at the top card of defending player's library. You may put that card on the bottom of that player's library";
    }

    public CoralFightersEffect(final CoralFightersEffect effect) {
        super(effect);
    }

    @Override
    public CoralFightersEffect copy() {
        return new CoralFightersEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        Player defendingPlayer = game.getPlayer(targetPointer.getFirst(game, source));
        if(controller != null && defendingPlayer != null) {
            Card card = defendingPlayer.getLibrary().getFromTop(game);
            if(card != null) {
                Cards cards = new CardsImpl();
                cards.add(card);
                controller.lookAtCards("Coral Fighters", cards, game);
                if (controller.chooseUse(outcome, "Do you wish to put card on the bottom of player's library?", source, game)) {
                    controller.moveCardToLibraryWithInfo(card, source.getSourceId(), game, Zone.LIBRARY, false, false);
                }
                else {
                    game.informPlayers(controller.getLogName() + " puts the card back on top of the library.");
                }
                return true;
            }
        }
        return false;
    }
}
