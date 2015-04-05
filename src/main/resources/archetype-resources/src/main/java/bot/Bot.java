/**
 * Warlight AI Game Bot
 *
 * Last update: January 29, 2015
 *
 * @author Jim van Eeden
 * @version 1.1
 * @License MIT License (http://opensource.org/Licenses/MIT)
 */
package ${package}.bot;

import ${package}.map.Region;
import ${package}.move.AttackTransferMove;
import ${package}.move.PlaceArmiesMove;
import java.util.ArrayList;

public interface Bot {

    public Region getStartingRegion(BotState state, Long timeOut);

    public ArrayList<PlaceArmiesMove> getPlaceArmiesMoves(BotState state, Long timeOut);

    public ArrayList<AttackTransferMove> getAttackTransferMoves(BotState state, Long timeOut);

}
