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
package mage.cards.f;

import java.util.UUID;
import mage.abilities.common.CastOnlyDuringPhaseStepSourceAbility;
import mage.abilities.condition.common.OnOpponentsTurnCondition;
import mage.abilities.effects.common.combat.CantAttackAnyPlayerAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.PhaseStep;
import mage.filter.common.FilterCreaturePermanent;

/**
 *
 * @author escplan9 (Derek Monturo - dmontur1 at gmail dot com)
 */
public class Festival extends CardImpl {

    public Festival(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.INSTANT},"{W}");

        // Cast Festival only during an opponent's upkeep.
        this.addAbility(new CastOnlyDuringPhaseStepSourceAbility(null, PhaseStep.UPKEEP, OnOpponentsTurnCondition.instance,
                "Cast {this} only during an opponent's upkeep"));
        
        // Creatures can't attack this turn.
        this.getSpellAbility().addEffect(new CantAttackAnyPlayerAllEffect(Duration.EndOfTurn, new FilterCreaturePermanent("creatures")));
        
    }

    public Festival(final Festival card) {
        super(card);
    }

    @Override
    public Festival copy() {
        return new Festival(this);
    }
}
