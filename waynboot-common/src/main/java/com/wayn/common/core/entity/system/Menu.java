package com.wayn.common.core.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wayn.common.base.entity.BaseEntity;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

/**
 * 菜单权限表 sys_menu
 */
@Data
@TableName("sys_menu")
@EqualsAndHashCode(callSuper = true)
public class Menu extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 3675171030764421787L;
    /**
     * 菜单ID
     */
    @TableId(type = IdType.AUTO)
    private Long menuId;

    /**
     * 菜单名称
     */
    @NotBlank(message = "菜单名称不能为空")
    private String menuName;

    /**
     * 父菜单id
     */
    @DecimalMin(value = "0", message = "父菜单id不能小于0")
    private Long parentId;

    /**
     * 显示顺序
     */
    @DecimalMin(value = "0", message = "显示顺序不能小于0")
    private Integer sort;

    /**
     * 路由地址
     */
    private String path;

    /**
     * 组件路径
     */
    private String component;

    /**
     * 是否为外链（0是 1否）
     */
    private String isFrame;

    /**
     * 类型（M目录 C菜单 F按钮）
     */
    @NotBlank(message = "菜单类型不能为空")
    private String menuType;

    /**
     * 菜单状态（0显示 1隐藏）
     */
    private Integer menuStatus;
    /**
     * 显示状态（0显示 1隐藏）
     */
    private Integer visible;

    /**
     * 权限字符串
     */
    private String perms;

    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 删除标志（0代表存在 1代表删除）
     */
    private Boolean delFlag;
    /**
     * 子菜单
     */
    @TableField(exist = false)
    private List<Menu> children = new ArrayList<>();

}
