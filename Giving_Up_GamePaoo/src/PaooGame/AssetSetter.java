package PaooGame;

import PaooGame.Item.Item_Chest;
import PaooGame.Tiles.Tile;
import PaooGame.entity.NPC_FinalBoss;
import PaooGame.monster.Monster_Bloom;

public class AssetSetter {
    Game game;
    public AssetSetter(Game game) {
        this.game = game;
    }

    public void setObject() {
        game.items[0] = new Item_Chest(game);
        game.items[0].worldX = 17 * Tile.TILE_SIZE;
        game.items[0].worldY = 25 * Tile.TILE_SIZE;

        game.items[1] = new Item_Chest(game);
        game.items[1].worldX = 45 * Tile.TILE_SIZE;
        game.items[1].worldY = 38 * Tile.TILE_SIZE;
    }

    public void setNPC() {
        game.npc[0] = new NPC_FinalBoss(game);
        game.npc[0].worldX = 28 *Tile.TILE_SIZE;
        game.npc[0].worldY = 7 * Tile.TILE_SIZE;
    }

    public void setMonster() {
        game.monster[0] = new Monster_Bloom(game);
        game.monster[0].worldX = 20 * Tile.TILE_SIZE;
        game.monster[0].worldY = 26 * Tile.TILE_SIZE;

        game.monster[1] = new Monster_Bloom(game);
        game.monster[1].worldX = 23 * Tile.TILE_SIZE;
        game.monster[1].worldY = 27 * Tile.TILE_SIZE;

        game.monster[2] = new Monster_Bloom(game);
        game.monster[2].worldX = 28 * Tile.TILE_SIZE;
        game.monster[2].worldY = 32 * Tile.TILE_SIZE;

        game.monster[3] = new Monster_Bloom(game);
        game.monster[3].worldX = 32 * Tile.TILE_SIZE;
        game.monster[3].worldY = 8 * Tile.TILE_SIZE;

        game.monster[4] = new Monster_Bloom(game);
        game.monster[4].worldX = 20 * Tile.TILE_SIZE;
        game.monster[4].worldY = 9 * Tile.TILE_SIZE;
    }
}